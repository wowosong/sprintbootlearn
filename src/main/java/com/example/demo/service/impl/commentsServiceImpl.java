package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Comments;
import com.example.demo.domain.Users;
import com.example.demo.mapper.CommentsMapper;
import com.example.demo.service.commentsService;
import com.example.demo.utils.MD5;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import tk.mybatis.orderbyhelper.OrderByHelper;

import java.util.List;
import java.util.Map;

@Component
@Validated
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class commentsServiceImpl  implements commentsService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Override
    public SimpleMessage postComments(Comments comments) {
        comments.setTimestamp(MD5.getTimestamp());
       commentsMapper.postComments(comments);
       return SimpleMessage.info("评论成功");
    }

    @Override
    public SimpleMessage editComments(Comments comments) {
        return  SimpleMessage.info(comments);
    }

    @Override
    public SimpleMessage getCommentsByUserId(String userId) {
        Comments commentsList=commentsMapper.getCommentsByUserId(userId);
        return SimpleMessage.info(commentsList);
    }
    @Override
    public SimpleMessage getCommentsByphotoId(String userId) {
        Comments commentsList=commentsMapper.getCommentsByUserId(userId);
        return SimpleMessage.info(commentsList);
    }

    @Override
    public SimplePage queryCommentByPage(PageQuery pageQuery) {
        Map map = pageQuery.convertFilterToMap();
        map.put("page",1);
        map.put("size",10);
        OrderByHelper.orderBy(pageQuery.convertSort());
        PageHelper.startPage(pageQuery.getPage(), pageQuery.getSize());
        System.out.println(map);
        List<Comments> list = commentsMapper.getCommentsMap(map);
        PageInfo pageInfo = new PageInfo(list);
        return new SimplePage<Users>().convert(pageInfo);
    }

    @Override
    public SimpleMessage getComments() {
//        List<Comments> comments=commentsMapper.getComments();
        List<Comments> comments=commentsMapper.selectAll();
        return  SimpleMessage.info(comments);
    }

}
