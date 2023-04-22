package com.abn.springboot.movierecommender.lesson7;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl1 {

    private Filter filter;

    /*
    constructor Injection
     */

    @Autowired
    public RecommenderImpl1( @Qualifier("collaborativeFilter") Filter filter) {
//        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
