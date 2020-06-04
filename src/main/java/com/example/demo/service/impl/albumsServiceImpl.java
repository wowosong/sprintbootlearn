package com.example.demo.service.impl;

import com.example.demo.domain.Albums;
import com.example.demo.mapper.AlbumsMapper;
import com.example.demo.service.albumsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class albumsServiceImpl  implements albumsService {
    @Autowired
    private AlbumsMapper albumsMapper;
    @Override
    public void addAlbums(Albums albums) {

    }

    @Override
    public Albums editAlbums(String id) {
        return null;
    }

    @Override
    public Albums getAlbumsByUserId(String id) {
        return null;
    }

    @Override
    public void deleteAlbums(String albumsId) {

    }

    @Override
    public void focusAlbums(String albumsId) {

    }

}
