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

 /**
  * @author huangjiusong
  * @param id
  * @return
  */
 SimpleMessage editAlbums(String id);

 /**
  *
  * @param albumsId
  * @return
  */
     SimpleMessage getAlbumsById(String albumsId);

 /**
  *
  * @param albumsId
  * @return
  */
 SimpleMessage  deleteAlbums(String albumsId);

 /**
  *
  * @param albumsId
  * @param userId
  * @return
  */
     SimpleMessage focusAlbums(String albumsId,String userId);
}
