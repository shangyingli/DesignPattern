package com.example.openandclose;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class NovelBookTest {
    private String name = "平凡的世界";
    private int price = 6000;
    private String author = "路遥";
    private IBooks books = new NovelBook(name, author, price);

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrice() {
        assertEquals(this.price, books.getPrice());
    }
}