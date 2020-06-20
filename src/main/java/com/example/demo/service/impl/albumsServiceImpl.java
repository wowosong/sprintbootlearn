package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import com.example.demo.domain.LikeAlbum;
import com.example.demo.mapper.AlbumsMapper;
import com.example.demo.service.albumsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Component
@Validated
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class albumsServiceImpl  implements albumsService {
    @Autowired
    private AlbumsMapper albumsMapper;

    @Override
    public SimpleMessage addAlbums(Albums albums) {
        albumsMapper.addAlbums(albums);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage editAlbums(String id) {
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage getAlbumsById(String albumsId) {
        Albums albums=albumsMapper.getAlbumsById(albumsId);
        return SimpleMessage.info(albums);
    }

    @Override
    public SimpleMessage deleteAlbums(String albumsId) {
        albumsMapper.deleteAlbums(albumsId);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage focusAlbums(String albumsId,String userId) {
        LikeAlbum likeAlbum=new LikeAlbum();
        likeAlbum.setAlbumLikedId(userId);
        likeAlbum.setLikeAlbumId(albumsId);
        likeAlbum.setTimestamp(new Date());
        albumsMapper.focusAlbums(likeAlbum);
        return SimpleMessage.info("关注成功");
    }
}
