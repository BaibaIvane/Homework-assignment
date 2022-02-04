package com.library.sql;

public final class LibraryManagementSql {

    public static final String SELECT_FROM_BOOKS = "SELECT * FROM books";

    public static final String SELECT_BOOK_BY_ID = "SELECT * FROM books where id = #{id}";

    public static final String UPDATE_BOOK_STATUS = "UPDATE books SET book_status = #{bookStatus} where id = #{id}";

    public static final String DELETE = "delete from books where id=#{id}";

    public static final String SELECT_FROM_READERS = "SELECT * FROM readers";

    public static final String SELECT_READER_BY_ID = "SELECT * FROM readers where id = #{id}";

    public static final String SELECT_BOOK_TITLE = "SELECT title from books where id = #{id}";

    public static final String UPDATE_READER_STATUS = "UPDATE readers SET reading_status = #{readingStatus} where id = #{id}";





}
