package com.libraryItems;

public class DVD extends Library{
    long duration;

    public DVD(String itemId , String title , String author , long duration){
        super(itemId , title , author);
        this.duration = duration;
    }

    public static void main(String[] args) {
        DVD d1 = new DVD("102" , "Haunted" , "Kapoor" , 150);
        d1.checkOut();
        d1.returnItem();
    }
}
