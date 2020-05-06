package com.example.demo;

import com.example.demo.controller.HelloWorldController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class DemoApplicationTests {

    @Test
    void testA() {
        assert (new HelloWorldController().index()=="Hello World");
    }
}
