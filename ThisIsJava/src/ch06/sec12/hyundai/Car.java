package src.ch06.sec12.hyundai;

// import 문으로 다른 패키지 클래스 사용 명시
import src.ch06.sec12.hankook.SnowTire;
import src.ch06.sec12.kumho.AllSeasonTire;

public class Car {

    public static void main(String[] args) {

        // 부품 필드 선언
        src.ch06.sec12.hankook.Tire tire1 = new src.ch06.sec12.hankook.Tire();
        src.ch06.sec12.kumho.Tire tire2 = new src.ch06.sec12.kumho.Tire();
        SnowTire tire3 = new SnowTire();
        AllSeasonTire tire4 = new AllSeasonTire();
    }
}