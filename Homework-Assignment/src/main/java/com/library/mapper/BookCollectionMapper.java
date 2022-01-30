package com.library.mapper;

import com.library.model.Book;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

import static com.library.sql.BookCollectionSql.SELECT_FROM_BOOKS_GROUP_BY_ID;

@Mapper
public interface BookCollectionMapper {

    @Select(SELECT_FROM_BOOKS_GROUP_BY_ID)
    List<Book> getBookList();
}
