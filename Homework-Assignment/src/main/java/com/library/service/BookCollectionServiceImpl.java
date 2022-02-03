package com.library.service;

import com.library.mapper.BookCollectionMapper;
import com.library.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BookCollectionServiceImpl implements BookCollectionService {

    private final BookCollectionMapper mapper;

    public List<Book> getAllBooks() {
        return mapper.getAllBooks();
    }
}
