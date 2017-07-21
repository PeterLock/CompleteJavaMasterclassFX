package com.peterlock;

import static com.peterlock.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnabe's implementation of run()");
    }
}
