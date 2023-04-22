package com.abn.springboot.movierecommender.lesson6;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public String[] recommendMovies(String movie) {
        System.out.println("Filter used: " + filter);
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
