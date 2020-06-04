package com.example.demo.service;

import com.example.demo.domain.Albums;

public interface albumsService {
    public void  addAlbums();
    public Albums editAlbums(String id);
    public Albums getAlbums(String id);
}
