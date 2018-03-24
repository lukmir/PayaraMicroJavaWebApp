package com.payaramicrowebapp.controller.rest.service;

import com.payaramicrowebapp.controller.rest.entity.PublishBook;
import com.payaramicrowebapp.controller.service.PublishBookService;
import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api/books")
@Counted
public class BookPublishController {

    @Inject
    private PublishBookService publishBookService;

    @POST
    public Response publish(PublishBook publishBook) {

    }
}
