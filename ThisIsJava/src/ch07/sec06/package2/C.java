package src.ch07.sec06.package2;

import src.ch07.sec06.package1.A;

public class C {

    // 메서드 선언
    public void method() {
        A a = new A();      // X
        a.field = "value";  // X
        a.method();         // X
    }
}
