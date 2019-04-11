package com.book;

public class Book {
    private int ID;
    private String name;
    private double price;
    private String author;
    public Book(){

    }
    public Book(int ID, String name, double price, String author){
        this.ID=ID;
        this.name=name;
        this.price=price;
        this.author=author;
    }
    public  int getlenght(String name){
        return name.length();
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
