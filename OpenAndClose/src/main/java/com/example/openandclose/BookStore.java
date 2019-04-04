package com.example.openandclose;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private static List<IBooks> books = new ArrayList<IBooks>();

    static {
        books.add(new OffNovelBook("天龙八部", "金庸", 3200));
        books.add(new OffNovelBook("巴黎圣母院", "雨果", 5600));
        books.add(new OffNovelBook("悲惨世界", "雨果", 3200));
        books.add(new OffNovelBook("金瓶梅", "兰陵王", 4300));
        books.add(new ComputerBook("Think In JAVA", "bRUCE bCKEL", 4400, "编程语言"));
    }

    public static void main(String[] args) {
        System.out.println("----------书店卖出去的书籍记录如下：----------");
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        for (IBooks book : books) {
            System.out.println("书籍名称： " + book.getName() + "\t\t书籍作者： " +
                    book.getAuthor() + "\t\t书籍价格： " + format.format(book.getPrice() / 100.0 )+ "元");
        }
    }
}
