package com.rangel.spring.apirestspring.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.rangel.spring.apirestspring.domain.Book;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Controller
@Path("/api/books")
public class BookController {
    
    private List<Book> books = new ArrayList<>();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(Book book) {
        books.add(book);
        return Response.ok(book).build();
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public Response findAll() {
        return Response.ok(books).build();
    }
}
