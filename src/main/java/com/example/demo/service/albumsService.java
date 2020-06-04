package com.example.demo.service;

import com.example.demo.domain.Albums;
import org.springframework.stereotype.Service;

@Service
public interface albumsService {
    public void  addAlbums(Albums albums);
    public Albums editAlbums(String id);
    public Albums getAlbumsByUserId(String userid);
    public void  deleteAlbums(String albumsId);
    public  void focusAlbums(String albumsId);
}
