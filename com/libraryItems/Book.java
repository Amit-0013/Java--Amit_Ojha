package com.libraryItems;

public class Book extends Library{
    String ISBN;

    public Book(String itemId, String title, String author , String ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        Book b1 = new Book("101" , "Head first java" , "Oracle" , "A100");
        b1.checkOut();
        b1.returnItem();
    }

}
