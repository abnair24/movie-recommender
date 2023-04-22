package com.abn.springboot.movierecommender.lession1;

public class RecommenderImpl {

    public String[] recommendMovies(String movie) {

        ContentFilter contentFilter = new ContentFilter();
        return contentFilter.getRecommendations(movie);

    }
}
