package com.tom.racing;

public class Racing {
    public static void main(String[] args) {
        Horse hr1 = new Horse();
        Horse hr2 = new Horse();
        HorseRunnable hr3 = new HorseRunnable();
        Thread thread = new Thread(hr3);
        hr1.start();
        hr2.start();
        thread.start();
    }
}
