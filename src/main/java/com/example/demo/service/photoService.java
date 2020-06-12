package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Photos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface photoService {
    public SimpleMessage postPhoto(Photos photos);
    public SimpleMessage getPhotoByAlbums(String albumsId);
    public SimpleMessage deletePhoto(Photos photos);
    public SimpleMessage editPhoto(Photos photos);
    public SimpleMessage batchPhoto(Photos photos);
    public  SimpleMessage getInfo();
    public List<Photos> selectPage();
}
