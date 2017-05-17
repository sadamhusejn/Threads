package com.company;

import java.util.Random;
import java.util.stream.Collector;

public class Main {

    public static final NumberCollector collector = new NumberCollector();

    public static void main(String[] args) {

        for (int i = 0; i < 500; i++) {

            Thread t = new Thread(Main::generate);
            t.start();
        }
    }

    static void generate() {

        Random random = new Random();
        for (int j = 0; j < 25000; j++) {
            int num = random.nextInt();
            collector.add(num);
        }
    }
}


