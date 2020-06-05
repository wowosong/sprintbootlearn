package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Comments;
import org.springframework.stereotype.Service;

@Service
public interface commentsService {
    public SimpleMessage postComments(Comments comments);
    public SimpleMessage editComments(Comments comments);
    public SimpleMessage getCommentsByUserId(String userId);
    public SimpleMessage getComments();
    public  SimpleMessage getCommentsByphotoId(String photoid);
}
