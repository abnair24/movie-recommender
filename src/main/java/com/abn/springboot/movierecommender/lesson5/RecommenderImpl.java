package com.abn.springboot.movierecommender.lesson5;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    @Autowired
    private Filter contentBasedFilter;

    public String[] recommendMovies(String movie) {
        System.out.println("Filter used: " + contentBasedFilter);
        return contentBasedFilter.getRecommendations(movie);
    }
}
