package com.libraryItems;

public class Library {
    String itemId;
    String title;
    String author;

    public Library(String itemId , String title , String author){
        this.author = author;
        this.title = title;
        this.itemId = itemId;
    }
    public void checkOut(){
        System.out.println("Checking out.");
    }
    public void returnItem(){
        System.out.println("Returning the item");
    }

}
