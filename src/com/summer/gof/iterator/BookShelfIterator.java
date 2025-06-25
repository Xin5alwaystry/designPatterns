package com.summer.gof.iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = this.bookShelf.getBooks(this.index);
        this.index++;
        return book;
    }
}
