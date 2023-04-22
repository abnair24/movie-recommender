package com.abn.springboot.movierecommender.lesson4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImpl recommender = applicationContext.getBean(RecommenderImpl.class);

        System.out.println(Arrays.toString(recommender.recommendMovies("Dory")));
    }
}
