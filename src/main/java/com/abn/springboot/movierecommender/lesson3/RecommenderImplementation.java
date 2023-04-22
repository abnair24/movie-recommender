package com.abn.springboot.movierecommender.lesson3;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter used: " + filter);
        String[] results = filter.getRecommendations(movie);
        return results;
    }

}
