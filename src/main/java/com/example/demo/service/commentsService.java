package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Comments;
import org.springframework.stereotype.Service;

@Service
public interface commentsService {
    public void postComments(Comments comments);
    public void editComments(Comments comments);
    public SimpleMessage getCommentsByUserId(String userId);
    public void getComments();
    public  SimpleMessage getCommentsByphotoId(String photoid);
}
