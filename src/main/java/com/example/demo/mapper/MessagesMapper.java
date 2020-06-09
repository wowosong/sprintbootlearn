package com.example.demo.mapper;

import com.example.demo.domain.Messages;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Repository
public interface MessagesMapper extends BaseMapper<Messages> {

    Messages postMessages(Messages messages) ;
}
