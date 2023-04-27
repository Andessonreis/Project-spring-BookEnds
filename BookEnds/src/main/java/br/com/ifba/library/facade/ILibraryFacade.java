/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.library.facade;

import br.com.ifba.library.model.Book;

import java.util.List;

/**
 *
 * @author Andesson reis
 */

public interface ILibraryFacade {
    
    List<Book> findAllBooks();
    Book findBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);

}
