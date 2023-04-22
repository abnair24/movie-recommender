package com.abn.springboot.movierecommender.lesson8;

public class Movie {

    private int id;
    private String name;
    private double rating;


    public Movie() {

    }

    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie [id = "+ id + ", name = " + name + ", rating = " + rating + " ] ";
    }
}
