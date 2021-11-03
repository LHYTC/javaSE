package com.leno.thread;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-11-02 23:18
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"------>"+i);
        }
    }

    public static void main(String[] args) {
        RunnableTest rt = new RunnableTest();
        Thread th = new Thread(rt);
        th.start();
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+"------>"+i);
        }
    }
}
