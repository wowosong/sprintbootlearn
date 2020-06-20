package com.example.demo;

import com.example.demo.controller.HelloWorldController;
import com.example.demo.domain.Users;
import com.example.demo.mapper.UserMapper;
//import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
//@Slf4j
class DemoApplicationTests {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplicationTests.class);
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before() throws IOException {
        //指定mybatis全局配置文件
        String resource = "mybatis/mybatis-config.xml";
        //读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //构建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
        log.info("{}",sqlSessionFactory);
    }
//    @Test
//    void testA() throws IOException {
//        String resource = "mybatis/mybatis-config.xml";
//        //读取全局配置文件
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        log.info("{}============");
//        //构建SqlSessionFactory对象
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        this.sqlSessionFactory = sqlSessionFactory;
//        log.info("{}",sqlSessionFactory);
//        assert (new HelloWorldController().index()=="Hello World");
//        log.info("{}",HelloWorldController.class);
//    }
    @Test
    public void queryInfo () throws IOException {
        this.before();
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Users userModel = userMapper.queryInfo("路人甲Java");
            log.info("{}", userModel);

        }catch (Exception e){
            log.info("输入错误：{}",e.getMessage());
        }
    }
}
