package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import com.example.demo.domain.Photos;
import com.example.demo.mapper.AlbumsMapper;
import com.example.demo.mapper.PhotoMapper;
import com.example.demo.service.photoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;

@Component
@Validated
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class photosServiceImpl implements photoService {
    @Autowired
    private PhotoMapper photoMapper;
    @Autowired
    AlbumsMapper albumsMapper;
    @Override
    public SimpleMessage postPhoto(Photos photos) {
        photoMapper.addPhotos(photos);
        return SimpleMessage.info("添加成功");
    }

    @Override
    public SimpleMessage getPhotoByAlbums(String albumsId) {
        Albums albums=albumsMapper.getAlbumsById(albumsId);
        if(Objects.isNull(albums)){
            SimpleMessage.warn("不存在该相册");
        }
        Photos photos=photoMapper.getPhotosByAlbumsId(albumsId);
        return SimpleMessage.info(photos);
    }

    @Override
    public SimpleMessage deletePhoto(String photoId) {
        Photos photos=photoMapper.getPhotosById(photoId);
        if(Objects.isNull(photos)){
            return  SimpleMessage.warn("照片不存在！");
        }
        photoMapper.deletePhotos(photoId);
        return SimpleMessage.info("删除成功");
    }

    @Override
    public SimpleMessage editPhoto(Photos photos) {

        return null;
    }

}
