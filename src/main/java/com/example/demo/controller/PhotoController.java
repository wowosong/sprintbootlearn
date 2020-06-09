package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Photos;
import com.example.demo.domain.Roles;
import com.example.demo.service.photoService;
import com.example.demo.service.roleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "照片管理")
public class PhotoController {
    private photoService photoService;
    public  PhotoController(){

    }
    @Autowired
    public PhotoController(photoService photoService){
        this.photoService=photoService;
    }
    @ApiOperation(value = "上传照片",notes = "上传照片")
    @PostMapping(value = "/postPhoto")
    public SimpleMessage postPhoto(@ApiParam(value = "上传照片") @RequestBody Photos photos){
        return photoService.postPhoto(photos);
    };
    @ApiOperation(value = "批量上传照片",notes = "批量上传照片")
    @PostMapping(value = "/postBatchPhoto")
    public SimpleMessage postBatchPhoto(@ApiParam(value = "上传照片") @RequestBody Photos photos){
        return photoService.batchPhoto(photos);
    };
    @ApiOperation(value = "获取相册照片",notes = "获取相册照片")
    @GetMapping(value = "/getPhotoByAlbums/{albumId}")
    public SimpleMessage getPhotoByAlbums(@ApiParam(value = "获取照片") @PathVariable String albumId){
        return photoService.getPhotoByAlbums(albumId);
    };
    @ApiOperation(value = "获取相册照片",notes = "获取相册照片")
    @GetMapping(value = "/getInfo")
    public SimpleMessage getInfo(){
        return photoService.getInfo();
    };
    @ApiOperation(value = "编辑照片",notes = "编辑照片")
    @PostMapping(value = "/editPhoto")
    public SimpleMessage editPhoto(@ApiParam(value = "获取照片") @RequestBody Photos photos){
        return photoService.editPhoto(photos);
    };
    @ApiOperation(value = "删除照片",notes = "删除照片")
    @DeleteMapping(value = "/deletePhoto")
    public SimpleMessage deletePhoto(@ApiParam(value = "获取照片") @RequestBody Photos photos){
        return photoService.deletePhoto(photos);
    };


}
