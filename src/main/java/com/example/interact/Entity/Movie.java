package com.example.interact.Entity;

public class Movie {

    private Long id;
    private String title;
    private int year;

    public void setId(long id){
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
