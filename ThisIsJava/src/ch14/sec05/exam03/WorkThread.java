package src.ch14.sec05.exam03;

public class WorkThread extends Thread {

    // 필드
    public boolean work = true;

    // 생성자
    public WorkThread(String name) {
        setName(name);
    }

    // 메서드
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + ": 작업 처리");
            } else {
                Thread.yield();
            }
        }
    }
}
