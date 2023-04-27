/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.library.bookController;

import br.com.ifba.library.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Andesson reis
 */

public interface IBookController {
    @PostMapping
    ResponseEntity<Book> createBook(@RequestBody Book book);

    @GetMapping
    ResponseEntity<List<Book>> getAllBooks();

    @GetMapping("/{id}")
    ResponseEntity<Book> getBookById(@PathVariable Long id);

    @PutMapping("/{id}")
    ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteBook(@PathVariable Long id);
  
}
