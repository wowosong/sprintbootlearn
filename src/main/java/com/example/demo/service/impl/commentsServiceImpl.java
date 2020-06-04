package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Comments;
import com.example.demo.mapper.CommentsMapper;
import com.example.demo.service.commentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class commentsServiceImpl  implements commentsService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Override
    public void postComments(Comments comments) {
        commentsMapper.postComments(comments);
    }

    @Override
    public void editComments(Comments comments) {

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
    public void getComments() {

    }
}
