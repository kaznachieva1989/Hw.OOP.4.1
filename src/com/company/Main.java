package com.company;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new Runner("Runner").start();

    }
}
