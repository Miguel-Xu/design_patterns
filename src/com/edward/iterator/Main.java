package com.edward.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendixBook(new Book("Head First Design Pattern"));
        bookShelf.appendixBook(new Book("Core Java"));
        bookShelf.appendixBook(new Book("Effective Java"));

        MyIterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }

    }
}
