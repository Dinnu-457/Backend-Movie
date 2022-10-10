package com.ivyprogram.BookMyShow;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name="")
@Table
public class Movie {
    private String name;
    private String Genre;
    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;

    public Movie() {
    }

    public Movie(String name, String genre, String type, long no) {
        this.name = name;
        Genre = genre;
        this.type = type;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }
}
