package com.libraryItems;

public class Magzine extends Library{
    int issueNumber;

    public Magzine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    public static void main(String[] args) {
        Magzine m1 = new Magzine("103" , "Times Now" , "News" , 12);
        m1.checkOut();
        m1.returnItem();
    }
}
