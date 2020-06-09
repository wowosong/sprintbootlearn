package com.example.demo.mapper;

import com.example.demo.domain.Photos;
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

    Photos getPhotosById(String photoId);
    Photos getinfo();
    void batchPhoto(Photos photos);
}
