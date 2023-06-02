package src.main.java.org.k1m743hyun.Object\ Oriented\ Programming.Classes;

class Person {}

class Student extends Person {}

class Undergraduate extends Student {}

class Inheritance {
    public static void main(String[] args) {
        Student s = new Undergraduate();
        Undergraduate u = new Student(); // error
    }
}
