package com.example.openandclose;

import org.junit.Test;

import static org.junit.Assert.*;

public class OffNovelBookTest {
    private IBooks below40NovelBook = new OffNovelBook("平凡的世界", "路遥", 3000);
    private IBooks above40NovelBook = new OffNovelBook("平凡的世界", "路遥", 6000);

    @Test
    public void testGetPriceBelow40() {
        assertEquals(2400, below40NovelBook.getPrice());
    }

    @Test
    public void testGetPriceAbove40() {
        assertEquals(5400, above40NovelBook.getPrice());
    }

}