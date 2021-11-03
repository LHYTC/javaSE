package com.leno.thread;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-11-03 00:32
 */
public class ThreadTest03 implements Runnable{
    public static void main(String[] args) {
        ThreadTest03 th1 = new ThreadTest03();
        ThreadTest03 th2 = new ThreadTest03();
        ThreadTest03 th3 = new ThreadTest03();
        ThreadTest03 th4 = new ThreadTest03();
        Thread thread1 = new Thread(th1);
        Thread thread2 = new Thread(th2);
        Thread thread3 = new Thread(th3);
        Thread thread4 = new Thread(th4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println(thread1.getName()+":"+thread1.getPriority());
        System.out.println(thread2.getName()+":"+thread2.getPriority());
        System.out.println(thread3.getName()+":"+thread3.getPriority());
        System.out.println(thread4.getName()+":"+thread4.getPriority());
        thread1.setPriority(10);
        thread2.setPriority(9);
        thread3.setPriority(8);
        thread4.setPriority(7);
        System.out.println(thread1.getName()+":"+thread1.getPriority());
        System.out.println(thread2.getName()+":"+thread2.getPriority());
        System.out.println(thread3.getName()+":"+thread3.getPriority());
        System.out.println(thread4.getName()+":"+thread4.getPriority());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
