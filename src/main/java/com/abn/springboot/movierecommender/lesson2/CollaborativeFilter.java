package com.abn.springboot.movierecommender.lesson2;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Cars"};
    }
}
