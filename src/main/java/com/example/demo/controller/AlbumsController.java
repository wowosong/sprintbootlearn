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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(value = "相册管理")
public class AlbumsController {
    private albumsService albumsService;
    public AlbumsController(){}
    @Autowired
    public AlbumsController(albumsService albumsService) {
        this.albumsService = albumsService;
    }
    @CrossOrigin(maxAge = 3600)
    @ApiOperation(value="获取用户",notes = "通过多个关键字查询用户")
    @RequestMapping(value = "/addAlbums",method = RequestMethod.POST)
    public SimpleMessage addAlbums(@ApiParam(value = "用户姓名",required = true)@RequestBody Albums albums){
        return albumsService.addAlbums(albums);
    }
}
