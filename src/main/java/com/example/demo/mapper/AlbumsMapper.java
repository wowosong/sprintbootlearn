package com.example.demo.mapper;

import com.example.demo.domain.Albums;
import com.example.demo.domain.LikeAlbum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Repository
@Mapper
public interface AlbumsMapper extends BaseMapper<Albums> {
    Albums getAlbumsById(String albumsId);
    void addAlbums(Albums albums);
    void deleteAlbums(String albumsId);
    void focusAlbums(LikeAlbum likeAlbum);
}
