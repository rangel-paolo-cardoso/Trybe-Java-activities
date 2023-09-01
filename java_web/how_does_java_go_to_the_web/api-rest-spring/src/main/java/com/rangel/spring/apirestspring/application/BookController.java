package com.rangel.spring.apirestspring.application;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.rangel.spring.apirestspring.domain.Book;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateById(@PathParam("id") UUID id, Book bookEntity) {
        try {
            Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
            book.setName(bookEntity.getName());
            book.setAuthor(bookEntity.getAuthor());
            return Response.ok(book).build();
        } catch (NoSuchElementException e) {
            return Response.status(404).build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response deleteById(@PathParam("id") UUID id) {
        try {
            Book book = books.stream()
                .filter(b -> b.getId().equals(id))
                .findAny()
                .orElseThrow();
            books.remove(book);
            return Response.ok(book).build();
        } catch (NoSuchElementException e) {
            return Response.status(404).build();
        }
    }
}
