package src.ch07.sec06.package1;

public class B {

    // 메서드 선언
    public void method() {
        A a = new A();      // O
        a.field = "value";  // O
        a.method();         // O
    }
}
