package com.summer.gof.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookListShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;

    public BookListShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBooks(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        this.last++;
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookListShelfIterator(this);
    }
}
