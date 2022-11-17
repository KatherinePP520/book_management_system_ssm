package com.springExample.service;

import com.springExample.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {

//    save
//    @param book
//    @return
    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
