package com.library.controller;

import com.library.model.Book;
import com.library.model.Reader;
import com.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ReaderController {

    ReaderService readerService;

    @Autowired
    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping("/library/readers")
    public List<Reader> getAllReaders() {
        List<Reader> listOfReaders = readerService.getAllReaders();
        return listOfReaders;
    }

    @GetMapping("/library/reader/{id}")
    public Reader getSpecificReader(@PathVariable Long id) {
        Reader reader = readerService.getSpecificReader(id);
        return reader;
    }

    @PostMapping("/library/reader/{id}/book/{bookId}")
    public Reader updateActiveReadingStatus(@PathVariable("id") Long id, @PathVariable("bookId") Long bookId,
                                    String booksStatus) {
        return readerService.updateActiveReadingStatus(id, bookId, booksStatus);
    }

    @PostMapping("/library/reader/{id}/return/{bookId}")
    public Reader updateNonReadingStatus(@PathVariable("id") Long id, @PathVariable("bookId") Long bookId,
                                      String booksStatus) {
        return readerService.updateNonReadingStatus(id, bookId, booksStatus);
    }

    @PostMapping("/library/reader/add")
    public Reader addReader(@RequestBody Reader reader) {
        Reader newReader = getSpecificReader(reader.getId());
        List<Reader> allReaders = getAllReaders();
        allReaders.add(newReader);
        return readerService.insertReader(reader);
    }
}
