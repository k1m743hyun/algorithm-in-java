package src.ch07.sec08.exam01;

public class KumhoTire extends Tire {

    // 메서드 재정의 (오버라이딩)
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}
