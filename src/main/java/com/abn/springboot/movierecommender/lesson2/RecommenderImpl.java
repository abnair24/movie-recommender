package com.abn.springboot.movierecommender.lesson2;

public class RecommenderImpl {

    private Filter filter;

    public RecommenderImpl(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter used: " + filter);
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
