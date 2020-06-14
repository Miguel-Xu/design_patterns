package com.edward.iterator;

public class BookShelfIterator implements MyIterator<Book>{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf, int index) {
        this.bookShelf = bookShelf;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }
        else return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
