package com.library.service;

import com.library.mapper.BookMapper;
import com.library.mapper.ReaderMapper;
import com.library.model.Book;
import com.library.model.Reader;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.library.model.Status.*;


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
        bookMapper.updateBookStatus(bookId, BOOK_OUT_OF_SHELF.getBookStatus());
        return existingReader;
    }

    public Reader updateNonReadingStatus(Long id, Long bookId, String bookStatus) {
        Reader existingReader = getSpecificReader(id);
        existingReader.setReadingStatus(NO_BOOKS_ASSIGNED.getBookStatus());
        readerMapper.updateReaderStatus(existingReader);
        bookMapper.updateBookStatus(bookId, BOOK_IN_THE_SHELF.getBookStatus());
        return existingReader;
    }
    public Reader addReader(Reader newReader) {
        Reader reader = new Reader();
        reader.setId(newReader.getId());
        reader.setFirstName(newReader.getFirstName());
        reader.setLastName(newReader.getLastName());
        reader.setReadingStatus(newReader.getReadingStatus());
        return reader;
    }

    public Reader insertReader(Reader reader) {
        readerMapper.addReader(reader);
        return reader;
    }
}
