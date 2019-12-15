package com.company;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1, j = 2; i < 6; i++, j++) {
            System.out.printf("%s берет палочку \n", Thread.currentThread().getName() + " " + i);
            if (j == 6) {
                System.out.printf("%s бежит к финишу \n", Thread.currentThread().getName() + " " + i);
                System.out.printf("%s бежит к Runner 4 \n", Thread.currentThread().getName() + " " + i);
            } else {
                System.out.printf("%s бежит к Runner %d \n", Thread.currentThread().getName() + " " + i, j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        }
        for (int i = 4, j = 4; i >= 1; i--, j--) {
            System.out.printf("%s берет палочку \n", Thread.currentThread().getName() + " " + i);
            if (i == 1) {
                interrupt();
            }
            else {
                System.out.printf("%s бежит к Runner %d \n", Thread.currentThread().getName() + " " + i, j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        }
    }
}
