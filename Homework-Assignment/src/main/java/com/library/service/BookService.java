package com.library.service;

import com.library.mapper.BookMapper;
import com.library.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
@AllArgsConstructor
public class BookService {

    private final BookMapper mapper;

    public List<Book> getAllBooks() {
        return mapper.getAllBooks();
    }

    public Book getSpecificBook(Long id) {
        return mapper.getSpecificBook(id);
    }

    public void delete(Long id) {
        mapper.delete(getSpecificBook(id));
    }

    public String getBookTitle(Long id) {
        return mapper.getBookTitle(id);
    }

}
