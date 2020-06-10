package com.example.demo.mapper;

import com.example.demo.domain.Albums;
import com.example.demo.domain.Photos;
import com.example.demo.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
@Repository
public interface PhotoMapper extends BaseMapper<Photos> {
    void addPhotos(Photos photos);
    Photos editPhotos(Photos photos);
    List<Photos> getPhotosByAlbumsId(String albumsId);
    void  deletePhotos(String photoId);
    Albums getAlbumsById(String id);
    Photos getPhotosById(String photoId);
    Users getUserById(String id);
    List<Photos> getinfo();
    void batchPhoto(Photos photos);
}
