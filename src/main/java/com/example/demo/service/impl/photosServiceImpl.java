package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import com.example.demo.domain.Photos;
import com.example.demo.mapper.AlbumsMapper;
import com.example.demo.mapper.PhotoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.photoService;
import com.example.demo.utils.MD5;
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
    @Autowired
    UserMapper userMapper;
    @Override
    public SimpleMessage postPhoto(Photos photos) {
        photos.setTimestamp(MD5.getTimestamp());
//        Albums albums=albumsMapper.getAlbumsById(photos.getAlbumId());
        Albums albums=albumsMapper.selectByPrimaryKey(photos.getAlbumId());
        if(Objects.isNull(albums)){
            return SimpleMessage.warn("不存在");
        }
        photos.setAuthorId("1");
        photoMapper.addPhotos(photos);
//        photoMapper.insert(photos);
        return SimpleMessage.info("添加成功");
    }

    @Override
    public SimpleMessage getPhotoByAlbums(String albumId) {
        Albums albums=albumsMapper.getAlbumsById(albumId);
        if(Objects.isNull(albums)){
            SimpleMessage.warn("不存在该相册");
        }
        List<Photos> photosList=photoMapper.getPhotosByAlbumsId(albumId);
        return SimpleMessage.info(photosList);
    }

    @Override
    public SimpleMessage deletePhoto(Photos photos) {
        Photos photosInfo=photoMapper.getPhotosById(photos.getId());
        if(Objects.isNull(photosInfo)){
            return  SimpleMessage.warn("照片不存在！");
        }
        photoMapper.deletePhotos(photos.getId());
        return SimpleMessage.info("删除成功");
    }

    @Override
    public SimpleMessage editPhoto(Photos photos) {
        photoMapper.editPhotos(photos);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage batchPhoto(Photos photos) {
        photoMapper.batchPhoto(photos);
        return SimpleMessage.info("批量上传成功");
    }
    @Override
    public SimpleMessage getInfo(){
        List<Photos> photos=photoMapper.getinfo();
        return SimpleMessage.info(photos);
    }

}
