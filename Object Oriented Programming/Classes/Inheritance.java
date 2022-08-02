class Person {}

class Student extends Person {}

class Undergraduate extends Student {}

class Main {
  public static void main(String[] args) {
    Student s = new Undergraduate();
    Undergraduate u = new Student(); // error
  }
}