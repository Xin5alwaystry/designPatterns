package com.summer.gof.iterator;

public class BookListShelfIterator implements Iterator {
    private BookListShelf bookListShelf;
    private int index;

    public BookListShelfIterator(BookListShelf bookListShelf) {
        this.bookListShelf = bookListShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.bookListShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = this.bookListShelf.getBooks(this.index);
        this.index++;
        return book;
    }
}
