 
node('maven-slave-140') {
    def docker_push_repo_url = '47.105.184.98:10001'
    def docker_pull_repo_url = '47.105.184.98:10000'
    def docker_image_name
    def tag = BUILD_ID
    def docker_compose_path = '/root/docker/demo'
    def docker_compose_service = 'demo-fxc-service'
    // 生成 jar 包路径
    def jar_path = 'target/demo-0.0.1-SNAPSHOT.jar'
    // 开发、测试服务器地址
    def remote_servers = [
        'dev': '47.105.184.98',
        'master': '47.105.184.98']

    stage('Settings branch params') {
        println "设置分支参数"
        if (BRANCH_NAME == 'dev') {
            // 设置构建保留的最大个数，超过指定的个数则丢弃
            properties([buildDiscarder(logRotator(numToKeepStr: '3'))])
            docker_image_name = 'microservice/dev/demo-fxc-service'
        } else if (BRANCH_NAME == 'test') {
            // 设置构建保留的最大个数，超过指定的个数则丢弃
            properties([buildDiscarder(logRotator(numToKeepStr: '3'))])
            docker_image_name = 'microservice/test/demo-fxc-service'
        } else if (BRANCH_NAME == 'master') {
            // 设置构建保留的最大个数，超过指定的个数则丢弃
            properties([buildDiscarder(logRotator(numToKeepStr: '7'))])
            docker_image_name = 'microservice/demo-fxc-service'
        } else {
            println "分支参数设置错误，当前分支：$BRANCH_NAME"
            currentBuild.result = "FAILURE"
        }
    }

    stage('Checkout code') {
        // 拉取最新的代码
        checkout scm
    }

    stage('Build code') {
        // 设置 Maven home 需要在 Jenkins 全局工具配置中对 Maven home 进行相关配置
        def mavenHome = tool 'Maven3'
        sh "'${mavenHome}/bin/mvn' clean package -Dactive=hanboard -Dmaven.test.skip=true"
    }

    stage('Archive') {
        echo '归档构建'
        archive jar_path
    }

    stage('Build image') {
        echo '构建 Docker 镜像'
        sh "cp ${jar_path} docker"
        dir('docker') {
            // 根据 Jenkins 最新运行的 Build id 构建模块 Docker 镜像
            sh "docker build -t ${docker_push_repo_url}/${docker_image_name}:${tag} ."
            //  生成 latest 版本 Docker 镜像
            sh "docker tag ${docker_push_repo_url}/${docker_image_name}:${tag} " +
                    "${docker_push_repo_url}/${docker_image_name}:latest"
        }
    }

    stage('Push image') {
        echo '上传 Docker 镜像'
        withCredentials([usernamePassword(credentialsId: 'docker',
                passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            sh "docker login -u ${USERNAME} -p ${PASSWORD} ${docker_push_repo_url}"
            sh "docker push ${docker_push_repo_url}/${docker_image_name}:${tag}"
            sh "docker push ${docker_push_repo_url}/${docker_image_name}:latest"
        }
    }

    stage('Clean local image') {
        echo '清理 Build 后的本地镜像'
        def images_id = sh(returnStdout: true,
                script: "docker images -q ${docker_push_repo_url}/${docker_image_name}")
                .split("\r?\n")
        def images_id_set = images_id as Set
        sh "docker rmi -f ${images_id_set.join(' ')}"
    }

    if (BRANCH_NAME == 'dev' || BRANCH_NAME == 'master') {
        stage('Remote server redeploy') {
            println "重新部署远程服务器：${BRANCH_NAME}，IP：${remote_servers[BRANCH_NAME]}"
            withCredentials([usernamePassword(credentialsId: 'docker',
                    passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                sshagent(credentials: ['ssh-server']) {
                    def command = """
                            uname -a;
                            cd ${docker_compose_path};
                            docker login -u ${USERNAME} -p ${PASSWORD} ${docker_pull_repo_url};
                            docker-compose stop ${docker_compose_service};
                            docker-compose rm -f ${docker_compose_service};
                            docker pull ${docker_pull_repo_url}/${docker_image_name}:latest;
                            docker-compose up -d ${docker_compose_service}
                        """
                    sh """ssh root@${remote_servers[BRANCH_NAME]} "$command" """
                }
            }
        }
    }
}


			