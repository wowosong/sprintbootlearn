package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Comments;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.commentsService;
@RestController
@Api(value = "评论管理")
public class CommentsController {
    private  commentsService commentsService;
//    public CommentsController(){}
    @Autowired
    public  CommentsController(commentsService commentsService){
        this.commentsService=commentsService;
    }
    @RequestMapping(value = "/postComment",method = RequestMethod.POST)
    public SimpleMessage postComment(@RequestBody Comments comments){
        return  commentsService.postComments(comments);
    }
    @RequestMapping(value = "/editComments",method = RequestMethod.POST)
    public SimpleMessage editComments(@RequestBody Comments comments){
        return  commentsService.editComments(comments);
    }
    @RequestMapping(value = "/getCommentsByUserId",method = RequestMethod.GET)
    public SimpleMessage getCommentsByUserId(@PathVariable String userId){
        return  commentsService.getCommentsByUserId(userId);
    }
    @RequestMapping(value = "/getComments",method = RequestMethod.GET)
    public SimpleMessage getComments(){
        return commentsService.getComments();
    }
    @RequestMapping(value = "/getCommentsByphotoId",method = RequestMethod.GET)
    public  SimpleMessage getCommentsByphotoId(@PathVariable String photoid){
        return commentsService.getCommentsByphotoId(photoid);
    }
}
