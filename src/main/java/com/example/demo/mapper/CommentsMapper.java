package com.example.demo.mapper;

import com.example.demo.domain.Comments;
import com.example.demo.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
import java.util.Map;

//import tk.mybatis.mapper.common.Mapper;
@Mapper
@Repository
public interface CommentsMapper extends BaseMapper<Comments> {

    Comments getCommentsByUserId(String userId);
    Comments editComments(Comments comments);
    void postComments(Comments comments);
    List<Comments> getCommentsByphotoId(String photoId);
    void deleteComments(String commentId);
    List<Comments> getCommentsMap(Map map);
    List<Comments> getComments();
    List<Comments> queryComment(Map map);
}
