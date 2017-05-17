package com.company;

import java.util.ArrayList;
import java.util.List;

public class NumberCollector{
    private final List<Integer> numbers = new ArrayList<>();
    public synchronized void add(int num){
        numbers.add(num);

    }
}


