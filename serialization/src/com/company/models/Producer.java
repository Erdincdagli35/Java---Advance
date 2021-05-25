package com.company.models;

import com.company.constant.Genre;

import java.io.Serializable;

public class Producer implements Serializable {

    private String name;
    private Genre genre;

    public Producer(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
