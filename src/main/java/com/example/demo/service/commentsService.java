package com.example.demo.service;

import com.example.demo.domain.Comments;

public interface commentsService {
    public void postComments(Comments comments);
    public void editComments(Comments comments);
    public  void getCommentsByUserId(String userId);
    public void getComments();
}
