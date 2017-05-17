package com.company;


public class MyThread extends Thread {
    private String id;

    public MyThread(String id) {
        this.id = id;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("I am the " + id + " ! i = " +i );

        }
    }


}
