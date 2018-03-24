package com.payaramicrowebapp.controller.rest.service;

import com.payaramicrowebapp.controller.service.BookService;
import com.payaramicrowebapp.model.entity.Book;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api/books")
public class BookController {

    @Inject
    private BookService bookService;

    @GET
    @RolesAllowed("read-books")
    public List<Book> findAll() {
        return bookService.getAll();
    }
}
