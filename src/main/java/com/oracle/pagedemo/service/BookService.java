package com.oracle.pagedemo.service;

import com.oracle.pagedemo.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Integer PAGE_SIZE = 3;

    List<Book> list();

    /**
     * 分页查询
     * @param page 当前页数
     * @param pageSize 每页条数
     * @return 当前页的数据
     */
    Map<String,Object> listPage(Integer page, Integer pageSize);

}
