package chap19_multithread;

import chap19_multithread.clazz.AutoSaveThread;

public class _14_daemonThread {
    public static void main(String[] args) {
        AutoSaveThread ast = new AutoSaveThread();
        //AutoSaveThread 객체를 데몬 스레드로 설정
        ast.setDaemon(true);//메인 스레드를 보조해주는 데몬 스레드

        ast.start();

        try {
            Thread.sleep(10000);//10초
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("메인스레드 종료됨");
        System.out.println("데몬 스레드인 AutoSaveThread 자동으로 종료됨");
    }
}
