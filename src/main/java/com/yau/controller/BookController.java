package com.yau.controller;

import com.yau.pojo.Book;
import com.yau.service.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    private final BooksService booksService;

    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/allBooks")
    public String list(Model model) {
        List<Book> books = booksService.getAllBooks();
        model.addAttribute("books", books);
        return "allBook";
    }

    @RequestMapping("/addBookPage")
    public String addBookPage() {
        return "addBookPage";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        System.out.println("book is: " + book);
        booksService.addBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/updateBookPage/{bookId}")
    public String updateBookPage(@PathVariable("bookId") int bookId, Model model) {
        Book book = booksService.getABook(bookId);
        model.addAttribute("book", book);
        return "updateBookPage";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        System.err.println(book);
        booksService.updateBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int bookId) {
        booksService.deleteBook(bookId);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/searchBookByName")
    public String searchBookByName(String bookName, Model model) {
        System.err.println("\"" + bookName + "\"");
        List<Book> result = booksService.searchBookByName(bookName);
        model.addAttribute("books", result);
        return "allBook";
    }
}
