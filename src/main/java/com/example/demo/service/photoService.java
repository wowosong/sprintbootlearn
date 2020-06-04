package com.example.demo.service;

import com.example.demo.domain.Photos;

public interface photoService {
    public void postPhoto(Photos photos);
    public Photos getPhotoByAlbums(String albumsId);
}
