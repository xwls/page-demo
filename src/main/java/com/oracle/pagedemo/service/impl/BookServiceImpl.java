package com.oracle.pagedemo.service.impl;

import com.oracle.pagedemo.entity.Book;
import com.oracle.pagedemo.mapper.BookMapper;
import com.oracle.pagedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> list() {
        return bookMapper.queryAll();
    }

    @Override
    public List<Book> listPage(Integer page, Integer pageSize) {
        Map<String,Object> param = new HashMap<>();
        param.put("limit",(page - 1) * pageSize);
        param.put("offset",pageSize);
        return bookMapper.queryPage(param);
    }
}
