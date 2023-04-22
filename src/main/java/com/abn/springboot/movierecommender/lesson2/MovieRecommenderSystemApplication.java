package com.abn.springboot.movierecommender.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImpl recommender = new RecommenderImpl(new ContentBasedFilter());
        String[] result = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(result));
    }

}
