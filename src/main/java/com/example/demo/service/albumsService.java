package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import org.springframework.stereotype.Service;

@Service
public interface albumsService {
    public SimpleMessage addAlbums(Albums albums);
    public SimpleMessage editAlbums(String id);
    public SimpleMessage getAlbumsById(String albumsId);
    public SimpleMessage  deleteAlbums(String albumsId);
    public SimpleMessage focusAlbums(String albumsId);
}
