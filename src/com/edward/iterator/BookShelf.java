package com.edward.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregation<Book>{
    private List<Book> books = new ArrayList<>();

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendixBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public MyIterator<Book> iterator() {
        return new BookShelfIterator(this,0);
    }
}
