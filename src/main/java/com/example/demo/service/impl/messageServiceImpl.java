package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Messages;
import com.example.demo.mapper.MessagesMapper;
import com.example.demo.service.messageService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Component
@Service
@Validated
@Transactional(rollbackFor = Exception.class)
public class messageServiceImpl implements messageService {
    private MessagesMapper messagesMapper;
    @Override
    public SimpleMessage PostMessage(Messages messages) {
        Messages messages1= messagesMapper.postMessages(messages);
        return null;
    }
}
