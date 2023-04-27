/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.library.service;
import br.com.ifba.library.model.Book;

import java.util.List;

/**
 *
 * @author Andesson reis
 */

public interface IBookService {
    List<Book> getAllBooks();
    Book findById(Long bookId);
    Book saveBook(Book book);
    void deleteBook(Long bookId);
}
