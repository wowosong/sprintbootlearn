package com.example.demo.mapper;

import com.example.demo.domain.Comments;
import com.example.demo.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
//import tk.mybatis.mapper.common.Mapper;
@Mapper
@Repository
public interface CommentsMapper extends BaseMapper<Comments> {

    Comments getCommentsByUserId(String userId);
    Comments editComments(Comments comments);
    void postComments(Comments comments);
    Comments getCommentsByphotoId(String photoId);
    void deleteComments(String commentId);

    List<Comments> getComments();
}
