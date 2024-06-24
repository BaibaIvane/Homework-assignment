package com.library.mapper;

import com.library.model.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.library.sql.LibraryManagementSql.*;
@Mapper
public interface BookMapper {

    @Select(SELECT_FROM_BOOKS)
    List<Book> getAllBooks();

    @Select(SELECT_BOOK_BY_ID)
    Book getSpecificBook(Long id);

    @Delete(DELETE)
    void delete(Book book);

    @Select(SELECT_BOOK_TITLE)
    String getBookTitle(Long id);

    @Update(UPDATE_BOOK_STATUS)
    void updateBookStatus(Long id, String bookStatus);

    @Options(useGeneratedKeys = true,
            keyProperty = "id",
            keyColumn = "id")
    @Insert(ADD_BOOK)
    void addBook(Book book);

}
