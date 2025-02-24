package com.open.closed;

import java.util.List;

public interface DatabasePersistence {
    void save(Book book);
    List<Book> getAllBooks();
}