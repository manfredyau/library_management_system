package com.yau.service;

import com.yau.pojo.Book;

import java.util.List;

public interface BooksService {
    List<Book> getAllBooks();

    Book getABook(int bookId);

    int addBook(Book book);

    int deleteBook(int bookId);

    int updateBook(Book book);

    List<Book> searchBookByName(String bookName);
}
