package com.summer.gof.iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBooks(int index) {
        return this.books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        this.last++;
    }

    public int getLength() {
        return this.books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}