package com.leno.thread;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-11-02 22:58
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+" -----------> "+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for(int i = 0; i < 5;i++){
            System.out.println(Thread.currentThread().getName()+" ===============>"+i);
        }
    }
}
