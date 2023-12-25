package com.telran.com.home10;

public class Publishing implements Comparable <Publishing>{

    private String publishing;
    private int yearOfPublishing;

    public Publishing(String publishing, int yearOfPublishing) {
        this.publishing = publishing;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public int compareTo(Publishing o) {
        return publishing.compareTo(o.getPublishing().);
    }
}

