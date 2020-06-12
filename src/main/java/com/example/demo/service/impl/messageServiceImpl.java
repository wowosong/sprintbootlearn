package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Messages;
import com.example.demo.domain.Photos;
import com.example.demo.mapper.MessagesMapper;
import com.example.demo.service.messageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Component
@Service
@Slf4j
@Validated
@Transactional(rollbackFor = Exception.class)
public class messageServiceImpl implements messageService {
    @Autowired
    private MessagesMapper messagesMapper;
    @Override
    public SimpleMessage PostMessage(Messages messages) {
//        Messages messages1= messagesMapper.postMessages(messages);
        messagesMapper.insert(messages);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage getMessage() {
        List<Messages>  messages= messagesMapper.selectAll();
        return SimpleMessage.info(messages);
    }

    @Override
    public SimpleMessage getMessageByUser(String userId) {
        Messages messages=new Messages();
        messages.setUserId(userId);
        List<Messages> messagesList=messagesMapper.select(messages);
        return SimpleMessage.info(messagesList);
    }
}
