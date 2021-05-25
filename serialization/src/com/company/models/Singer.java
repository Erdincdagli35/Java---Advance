package com.company.models;

import com.company.constant.Genre;

import java.io.Serializable;

public class Singer implements Serializable {

    private String name;
    private Genre genre;
    private Boolean band;

    public Singer(String name, Genre genre, Boolean band) {
        this.name = name;
        this.genre = genre;
        this.band = band;
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

    public Boolean getBand() {
        return band;
    }

    public void setBand(Boolean band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", band=" + band +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }
}