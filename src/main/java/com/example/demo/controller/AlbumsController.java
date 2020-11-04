package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import com.example.demo.domain.Users;
import com.example.demo.service.albumsService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(value = "相册管理")

public class AlbumsController {
    private albumsService albumsService;
    public AlbumsController(){};
    @Autowired
    public AlbumsController(albumsService albumsService) {
        this.albumsService = albumsService;
    }
    @ApiOperation(value="添加相册",notes = "通过多个关键字查询用户")
    @RequestMapping(value = "/addAlbums",method = RequestMethod.POST)
    @ApiParam(value = "添加相册",required = true)
    public SimpleMessage addAlbums(@RequestBody @Validated Albums albums, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            for(FieldError fieldError:bindingResult.getFieldErrors()){
                return SimpleMessage.warn(fieldError.getDefaultMessage());
            }
        }
        return albumsService.addAlbums(albums);
    }
    @RequestMapping(value = "/focusAlbums",method = RequestMethod.POST)
    public SimpleMessage focusAlbums(@ApiParam(value = "收藏相册",required = true)@RequestParam String albumsId,@RequestParam String userId){
        return albumsService.focusAlbums(albumsId,userId);
    }
}
