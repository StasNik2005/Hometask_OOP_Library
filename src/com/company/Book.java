package com.company;

import java.util.Arrays;
import java.util.Date;

public class Book {
    private String Name;
    private String Author;
    private Date God_isdania;
    int kolichestvo_stranic;

    public Book(String name, String author, Date god, int kolichestvo, int probeg) {
        Name = name;
        Author = author;
        God_isdania = god;
        this.kolichestvo_stranic = kolichestvo;

    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public Date getGod_isdania() {
        return God_isdania;
    }

    public int getKolichestvo_stranic() {
        return kolichestvo_stranic;
    }
}
