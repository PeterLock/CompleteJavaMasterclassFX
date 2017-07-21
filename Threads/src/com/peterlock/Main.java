package com.peterlock;

import static com.peterlock.ThreadColor.ANSI_GREEN;
import static com.peterlock.ThreadColor.ANSI_PURPLE;
import static com.peterlock.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run(){
//                super.run();
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");

    }
}
