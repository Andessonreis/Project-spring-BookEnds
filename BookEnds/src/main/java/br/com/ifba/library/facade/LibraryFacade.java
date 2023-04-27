/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.library.facade;


import br.com.ifba.library.model.Book;
import br.com.ifba.library.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andesson reis
 */

@Service
public class LibraryFacade implements ILibraryFacade {

    @Autowired
    private BookService bookService;

    @Override
    public List<Book> findAllBooks() {
        return bookService.getAllBooks();
    }

    @Override
   public Book findBookById(Long id) {
        return bookService.findById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookService.saveBook(book);
    }
    @Override
    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}
