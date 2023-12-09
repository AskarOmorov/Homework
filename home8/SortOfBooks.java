package com.telran.com.home8;

import java.util.*;
// Можете пожалуйста кинуть инвайт, так как не знал что нужно принять за 7 дней смотрю уже истекло
// Не смог понять как будет выглядеть объект полка
public class SortOfBooks {

    public static void main(String[] args) {

        Author author1 = new Author("Lev", "Tolstoi", 1828);
        Author author2 = new Author("Aleksandr", "Pushkin", 1799);
        Author author3 = new Author("Anton", "Chehov", 1860);
        Publishing litres = new Publishing("litres", 1234);
        Publishing ridero = new Publishing("ridero", 2045);

        Book book1 = new Book("detstvo", author1, 123764, 1778, litres);
        Book book2 = new Book("anna", author1, 686789, 799, litres);
        Book book3 = new Book("voina", author1, 7465889, 9854, litres);
        Book book4 = new Book("futlar", author2, 897, 465, ridero);
        Book book5 = new Book("toska", author2, 8787, 1779, litres);
        Book book6 = new Book("dama", author3, 7487, 179879, ridero);
        Book book7 = new Book("polt", author3, 90736, 235, ridero);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите способ сортировки: 1 по автору, 2 по году выпуска, 3 по редакции");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                Collections.sort(bookList, new SortByauthor());
                System.out.println(bookList);
            case 2:
                Collections.sort(bookList, new SortByYearOfPublishing());
                System.out.println(bookList);
            case 3:
                Collections.sort(bookList, new SortByPublishing());
        }
    }
}
