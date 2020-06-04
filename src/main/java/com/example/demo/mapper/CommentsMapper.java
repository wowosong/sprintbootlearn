package com.example.demo.mapper;

import com.example.demo.domain.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommentsMapper {

    Comments getCommentsByUserId(String userId);
    Comments editComments(Comments comments);
    void postComments(Comments comments);
    Comments getCommentsByphotoId(String photoId);
    void deleteComments(String commentId);
//    void
}
