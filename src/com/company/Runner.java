package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 1, j = 2; i < 6; i++, j++) {
                System.out.printf("%s берет палочку \n", Thread.currentThread().getName() + " " + i);
                if (j == 6) {
                    System.out.printf("%s бежит к финишу \n", Thread.currentThread().getName() + " " + i);
                } else {
                    System.out.printf("%s бежит к Runner %s \n", Thread.currentThread().getName() + " " + i, j);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread has been interrupted");
                    }
                }
            }
        }
    }
}
