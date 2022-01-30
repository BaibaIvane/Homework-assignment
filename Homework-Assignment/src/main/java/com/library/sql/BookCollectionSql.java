package com.library.sql;

public class BookCollectionSql {

    public static final String SELECT_FROM_BOOKS = "select b.id, b.title, b.author, b.description\n" +
            " from books as b";

    public static final String SELECT_FROM_BOOKS_GROUP_BY_ID = SELECT_FROM_BOOKS + " group by b.id;";
}
