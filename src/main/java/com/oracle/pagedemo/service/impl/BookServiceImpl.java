package com.oracle.pagedemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Map<String,Object> listPage(Integer page, Integer pageSize) {
        Map<String,Object> param = new HashMap<>();
        //开始分页
        PageHelper.startPage(page,PAGE_SIZE);
        List<Book> books = bookMapper.queryAll();
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        param.put("books",pageInfo.getList());
        param.put("pageNum",pageInfo.getPages());
        return param;
    }
}
