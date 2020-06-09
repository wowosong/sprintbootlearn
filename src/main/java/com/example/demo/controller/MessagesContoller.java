package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Messages;
import com.example.demo.domain.Photos;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.messageService;
@RestController
@Api(value = "评论管理")
public class MessagesContoller {
    private  messageService messageService;
    @Autowired
    public MessagesContoller(messageService messageService) {
        this.messageService=messageService;
    }
    @ApiOperation(value = "上传照片",notes = "上传照片")
    @PostMapping(value = "/PostMessage")
    public SimpleMessage PostMessage(@ApiParam(value = "上传照片") @RequestBody Messages Messages){
        return messageService.PostMessage(Messages);
    };

}
