package com.abn.springboot.movierecommender.lesson4;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    @Autowired
    private Filter filter;


    public String[] recommendMovies(String movie) {

        System.out.println("filter in use: " + filter + "\n");

        return filter.getRecommendations(movie);
    }
}
