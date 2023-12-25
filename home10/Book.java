package com.telran.com.home10;

public class Book {

    private String name;
    private Author author;
    private int numberOfPages;
    private int yerOfPublishing;
    private Publishing publishing;

    public Book(String name, Author author, int numberOfPages, int yerOfPublishing, Publishing publishing) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yerOfPublishing = yerOfPublishing;
        this.publishing = publishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYerOfPublishing() {
        return yerOfPublishing;
    }

    public Publishing getPublishing() {
        return publishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", numberOfPages=" + numberOfPages +
                ", yerOfPublishing=" + yerOfPublishing +
                ", publishing=" + publishing +
                '}'+"\n";
    }
}
