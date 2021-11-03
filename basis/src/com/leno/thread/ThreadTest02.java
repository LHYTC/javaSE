package com.leno.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-11-02 23:38
 */
public class ThreadTest02 extends Thread {
    @Override
    public void run() {
        super.run();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+list);
    }

    public static void main(String[] args) {
        ThreadTest02 th = new ThreadTest02();
        th.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i <= 100; i++){
                    if(i % 2 == 0){
                        list.add(i);
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+list);
            }
        }).start();
    }
}
