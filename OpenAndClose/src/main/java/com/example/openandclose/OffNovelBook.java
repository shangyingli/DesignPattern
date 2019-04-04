package com.example.openandclose;

public class OffNovelBook extends NovelBook{

    public OffNovelBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public int getPrice() {
        int originPrice = super.getPrice();
        int offPrice = 0;
        if (originPrice > 4000) {
            offPrice = originPrice * 90 / 100;
        } else {
            offPrice = originPrice * 80 / 100;
        }
        return offPrice;
    }
}
