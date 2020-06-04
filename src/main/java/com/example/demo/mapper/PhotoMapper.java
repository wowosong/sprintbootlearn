package com.example.demo.mapper;

import com.example.demo.domain.Photos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PhotoMapper {
    void addPhotos(Photos photos);
    Photos editPhotos(Photos photos);
    Photos getPhotosByAlbumsId(String albumsId);
    void  deletePhotos(String photoId);

    Photos getPhotosById(String photoId);
}
