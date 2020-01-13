package com.oracle.pagedemo;

import com.oracle.pagedemo.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;

@SpringBootTest
public class PageDemoApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
        Integer count = bookMapper.count();
        System.out.println("count = " + count);
    }

}
