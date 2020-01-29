/**
 * @program SpringBooks
 * @description: book
 * @author: mf
 * @create: 2020/01/26 17:29
 */

package org.example.controller;

import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
