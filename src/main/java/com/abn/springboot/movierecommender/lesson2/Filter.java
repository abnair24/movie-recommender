package com.abn.springboot.movierecommender.lesson2;

public interface Filter {

    public String[] getRecommendations(String movie);
}
