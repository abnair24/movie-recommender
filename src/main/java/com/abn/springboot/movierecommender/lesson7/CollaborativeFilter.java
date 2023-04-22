package com.abn.springboot.movierecommender.lesson7;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Cars"};
    }
}
