package com.example.demo.controller;

import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Comments;
import com.example.demo.domain.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.commentsService;
@RestController
@Api(value = "评论管理")
public  class CommentsController {
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
    @ApiOperation(value = "分页查询评论", notes = "filter:keywords=;status=;", response = Comments.class)
    @RequestMapping(value = "/getComments",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码：第几页", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示的数据条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "filter", value = "查询条件（keywords=;status=;）", paramType = "query"),
            @ApiImplicitParam(name = "order", value = "排序规则（createTime=desc）", paramType = "query")})
    public SimplePage<Comments> getComments(PageQuery pageQuery){
        String filter = pageQuery.getFilter();
        System.out.println(filter);
        pageQuery.setFilter(filter);
        return commentsService.getComments(pageQuery);
    }
    @ApiOperation(value = "分页查询评论", notes = "filter:keywords=;status=;", response = Comments.class)
    @GetMapping("/queryComments")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码：第几页", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示的数据条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "filter", value = "查询条件（keywords=;status=;）", paramType = "query"),
            @ApiImplicitParam(name = "order", value = "排序规则（createTime=desc）", paramType = "query")})
    public SimplePage<Comments> queryCommentByPage(PageQuery pageQuery){
        String filter = pageQuery.getFilter();
        pageQuery.setFilter(filter);
        return commentsService.queryCommentByPage(pageQuery);
    }
    @RequestMapping(value = "/getCommentsByphotoId/{photoid}",method = RequestMethod.GET)
    public  SimpleMessage getCommentsByphotoId(@PathVariable String photoid){
        return commentsService.getCommentsByphotoId(photoid);
    }

}
