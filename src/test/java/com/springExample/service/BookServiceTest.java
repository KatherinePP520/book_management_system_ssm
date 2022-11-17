package com.springExample.service;

import com.springExample.config.SpringConfig;
import com.springExample.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
       Book book= bookService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testGetAll(){
       List<Book> all= bookService.getAll();
        System.out.println(all);
    }
}
