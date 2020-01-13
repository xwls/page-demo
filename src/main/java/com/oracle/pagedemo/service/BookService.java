package com.oracle.pagedemo.service;

import com.oracle.pagedemo.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> list();

    /**
     * 分页查询
     * @param page 当前页数
     * @param pageSize 每页条数
     * @return 当前页的数据
     */
    List<Book> listPage(Integer page, Integer pageSize);

}
