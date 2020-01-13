package com.oracle.pagedemo.mapper;

import com.oracle.pagedemo.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BookMapper {

    List<Book> queryAll();
    Book queryById(Integer bookId);

    /**
     * 分页查询
     * @param param LIMIT limit,offset ,需要包含limit和offset
     * @return 当前页的数据
     */
    List<Book> queryPage(Map<String,Object> param);

    /**
     * 获取总数量
     * @return 一共有多少条数据
     */
    Integer count();

}
