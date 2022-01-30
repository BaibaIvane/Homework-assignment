package com.library.service;

import com.library.mapper.BookCollectionMapper;
import com.library.model.Book;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookCollectionService {

    private final BookCollectionMapper mapper;

    public BookCollectionService(BookCollectionMapper mapper) {
        this.mapper = mapper;
    }

    public List<Book> getBookList() {
        return mapper.getBookList();
    }
}
