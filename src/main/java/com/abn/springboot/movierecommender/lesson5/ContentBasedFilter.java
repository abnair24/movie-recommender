package com.abn.springboot.movierecommender.lesson5;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        String[] result = new String[] {"ABC", "FFG", "HIG"};
        return result;
    }
}
