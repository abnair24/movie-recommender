package com.abn.springboot.movierecommender.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        String[] result;
        //RecommenderImpl1 constuctor injection
        System.out.println("Calling getBean() on RecommenderImpl1");
        RecommenderImpl1 recommender = applicationContext.getBean(RecommenderImpl1.class);
        result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));

        //RecommenderImpl2 injects dependency using setter method
        System.out.println("Calling getBean() on RecommenderImpl2");
        RecommenderImpl2 recommender2 = applicationContext.getBean(RecommenderImpl2.class);
        result = recommender2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));

        //RecommenderImpl3 injects dependency using field injection
        System.out.println("Calling getBean() on RecommenderImpl3");
        RecommenderImpl3 recommender3 = applicationContext.getBean(RecommenderImpl3.class);
        result = recommender3.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}
