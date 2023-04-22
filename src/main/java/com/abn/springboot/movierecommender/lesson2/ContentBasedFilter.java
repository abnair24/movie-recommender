package com.abn.springboot.movierecommender.lesson2;

public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        String[] result = new String[] {"ABC", "FFG", "HIG"};
        return result;
    }
}
