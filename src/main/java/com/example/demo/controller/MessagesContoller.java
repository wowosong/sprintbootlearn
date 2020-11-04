package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Messages;
import com.example.demo.service.messageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@Api(value = "评论管理")
public class MessagesContoller {
    private  messageService messageService;
    @Autowired
    public MessagesContoller(messageService messageService) {
        this.messageService=messageService;
    }
    @ApiOperation(value = "提交信息",notes = "提交信息")
    @PostMapping(value = "/PostMessage")
    public SimpleMessage PostMessage(@ApiParam(value = "上传照片") @RequestBody Messages Messages){
        return messageService.PostMessage(Messages);
    };
    @ApiOperation(value = "获取信息",notes = "获取信息")
    @GetMapping(value = "/getMessage")
    public SimpleMessage getMessage(){
        return messageService.getMessage();
    };
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    @GetMapping(value = "/getMessageByUser/{userId}")
    public SimpleMessage getMessageByUser(@PathVariable String userId){
        return messageService.getMessageByUser(userId);
    };

}
