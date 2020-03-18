package com.yau.mapper;

import com.yau.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BooksMapper {
    @Select("select bookid, bookname, bookcounts, detail from books order by bookid;")
    List<Book> getAllBooks();

    @Select("select bookid, bookname, bookcounts, detail from books where bookid = #{bookId} ;")
    Book getABook(@Param("bookId") int bookId);

    @Insert("insert into books(bookname, bookcounts, detail) " +
            "values (#{bookName}, #{bookCounts} , #{detail}  );")
    int addBook(Book book);

    @Delete("delete from books where bookid = #{bookId};")
    int deleteBook(@Param("bookId") int bookId);

    @Update("update books set " +
            "bookname = #{bookName}, " +
            "bookcounts = #{bookCounts}, " +
            "detail = #{detail} " +
            "where bookid = #{bookId} ;")
    int updateBook(Book book);

    @Select("select bookid, bookname, bookcounts, detail from books where lower(bookname) " +
            "like '%'||lower(#{bookName}||'%') order by bookid;")
    List<Book> searchBookByName(@Param("bookName") String bookName);
}
