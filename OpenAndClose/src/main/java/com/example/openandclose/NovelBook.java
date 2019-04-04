package com.example.openandclose;

public class NovelBook implements IBooks {

    private String name;
    private String author;
    private int price;

    public NovelBook(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
