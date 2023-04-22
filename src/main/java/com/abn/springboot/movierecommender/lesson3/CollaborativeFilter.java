package com.abn.springboot.movierecommender.lesson3;

import com.abn.springboot.movierecommender.lesson2.Filter;
import org.springframework.stereotype.Component;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
