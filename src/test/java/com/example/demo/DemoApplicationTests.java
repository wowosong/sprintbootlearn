package com.example.demo;

import com.example.demo.controller.HelloWorldController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@Slf4j
class DemoApplicationTests {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplicationTests.class);
    @Test
    void testA() {
        assert (new HelloWorldController().index()=="Hello World");
        log.info("{}",HelloWorldController.class);
    }
}
