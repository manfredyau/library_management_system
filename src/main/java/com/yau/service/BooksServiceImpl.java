package com.yau.service;

import com.yau.mapper.BooksMapper;
import com.yau.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    private final BooksMapper booksMapper;

    public BooksServiceImpl(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return booksMapper.getAllBooks();
    }

    @Override
    public Book getABook(int bookId) {
        return booksMapper.getABook(bookId);
    }

    @Override
    public int addBook(Book book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBook(int bookId) {
        return booksMapper.deleteBook(bookId);
    }

    @Override
    public int updateBook(Book book) {
        return booksMapper.updateBook(book);
    }

    @Override
    public List<Book> searchBookByName(String bookName) {
        return booksMapper.searchBookByName(bookName);
    }
}
