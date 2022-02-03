package com.library.mapper;

import com.library.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import static com.library.sql.LibraryRegistrationSql.SELECT_FROM_BOOKS;

@Mapper
public interface BookCollectionMapper {

    @Select(SELECT_FROM_BOOKS)
    List<Book> getAllBooks();

}
