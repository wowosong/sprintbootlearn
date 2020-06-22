package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Albums;
import org.springframework.stereotype.Service;

@Service
public  interface albumsService {
    /**
     * @author huangjiusong
     * @param albums
     * @since
     * @return
     */
     SimpleMessage addAlbums(Albums albums);
     SimpleMessage editAlbums(String id);
     SimpleMessage getAlbumsById(String albumsId);
     SimpleMessage  deleteAlbums(String albumsId);
     SimpleMessage focusAlbums(String albumsId,String userId);
}
