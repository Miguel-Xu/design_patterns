package com.edward.iterator;

public class BookShelf implements Aggregation<Book>{
    private Book[] books;
    private int length;

    public BookShelf(int length) {
        this.books = new Book[length];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendixBook(Book book){
        books[length++] = book;
    }

    public int getLength(){
        return this.length;
    }

    @Override
    public MyIterator<Book> iterator() {
        return new BookShelfIterator(this,0);
    }
}
