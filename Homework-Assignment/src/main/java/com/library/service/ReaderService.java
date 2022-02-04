package com.library.service;

import com.library.mapper.BookMapper;
import com.library.mapper.ReaderMapper;
import com.library.model.Reader;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class ReaderService {

    private final ReaderMapper readerMapper;
    private final BookMapper bookMapper;
    private final BookService bookService;

    public List<Reader> getAllReaders() {
        return readerMapper.getAllReaders();
    }

    public Reader getSpecificReader(Long id) {
        return readerMapper.getSpecificReader(id);
    }

    public Reader updateActiveReadingStatus(Long id, Long bookId, String bookStatus) {
        Reader existingReader = getSpecificReader(id);
        existingReader.setReadingStatus(bookMapper.getBookTitle(bookId));
        readerMapper.updateReaderStatus(existingReader);
        bookMapper.updateBookStatus(bookId, "Out of shelf!");
        return existingReader;
    }

    public Reader updateNonReadingStatus(Long id, Long bookId, String bookStatus) {
        Reader existingReader = getSpecificReader(id);
        existingReader.setReadingStatus("No books assigned");
        readerMapper.updateReaderStatus(existingReader);
        bookMapper.updateBookStatus(bookId, "In the shelf!");
        return existingReader;
    }
}
