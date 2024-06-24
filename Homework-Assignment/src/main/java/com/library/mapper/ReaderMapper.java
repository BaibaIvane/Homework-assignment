package com.library.mapper;

import com.library.model.Book;
import com.library.model.Reader;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.library.sql.LibraryManagementSql.*;

@Mapper
public interface ReaderMapper {

    @Select(SELECT_FROM_READERS)
    List<Reader> getAllReaders();

    @Select(SELECT_READER_BY_ID)
    Reader getSpecificReader(Long id);

    @Update(UPDATE_READER_STATUS)
    void updateReaderStatus(Reader reader);

    @Options(useGeneratedKeys = true,
            keyProperty = "id",
            keyColumn = "id")
    @Insert(ADD_READER)
    void addReader(Reader reader);

}
