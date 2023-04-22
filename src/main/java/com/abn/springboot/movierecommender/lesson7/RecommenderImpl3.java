package com.abn.springboot.movierecommender.lesson7;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl3 {

    @Autowired
    @Qualifier("contentBasedFilter")
    private Filter filter;

    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
