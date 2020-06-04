package com.example.demo.mapper;

import com.example.demo.domain.Albums;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AlbumsMapper {
    Albums getAlbumsById(String albumsId);

    void addAlbums(Albums albums);

    void deleteAlbums(String albumsId);
}
