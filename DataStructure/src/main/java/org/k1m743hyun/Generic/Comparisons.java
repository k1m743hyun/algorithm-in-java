package src.main.java.org.k1m743hyun.Generic;

class Comparisons {
  public static void main(String[] args) {
    String one = "hello world";
    String two = "hello world";

    if (one.equals(two)) {
      System.out.println("They are the same");
    }

    Object o = one;
    Object t = two;

    if (o.equals(t)) {
      System.out.println("They are the same");
    }

    /*
    Monkey m = new Monkey();
    Monkey n = new Monkey();
    
    if (m.equals(n)) {
      System.out.println("They are the same");
    }
    */
  }
}