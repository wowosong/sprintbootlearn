package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Roles;
import org.springframework.stereotype.Service;

@Service
public interface roleService {
    SimpleMessage addRole(Roles roles);
    SimpleMessage editRole();
    SimpleMessage deleteRole();
    SimpleMessage getRole();
}
