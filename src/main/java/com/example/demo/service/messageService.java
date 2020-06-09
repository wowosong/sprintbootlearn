package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Messages;
import org.springframework.stereotype.Service;

@Service
public interface messageService {
    public SimpleMessage PostMessage(Messages messages);
}
