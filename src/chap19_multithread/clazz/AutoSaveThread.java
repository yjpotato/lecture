package chap19_multithread.clazz;

public class AutoSaveThread extends Thread {
    public void save(){
        System.out.println("자동 저장되었습니다.");
    }

    @Override
    public void run() {
        while (true) { //계속 진행될수 있도록 while문 사용
            try {
                Thread.sleep(3000); //3초마다
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            save();
        }
    }
}
