package com.abn.springboot.movierecommender.lession1;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {

        RecommenderImpl recommender = new RecommenderImpl();
        String[] results = recommender.recommendMovies("Finding Dory");
//        SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        System.out.println(Arrays.toString(results));
    }
}
