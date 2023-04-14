import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
/*
 * Create the Student and Priorities classes here.
 */
 class Student {
     
     private final int id;
     private final String name;
     private final double cgpa;
     
     public Student(int id, String name, double cgpa) {
         
         this.id = id;
         this.name = name;
         this.cgpa = cgpa;
     }
     
     public int getId() {
         return this.id;
     }
     
     public String getName() {
         return this.name;
     }
     
     public double getCGPA() {
         return this.cgpa;
     }
 }
 
 class Priorities {
     
     PriorityQueue<Student> q = new PriorityQueue<>(
         Comparator.comparing(Student::getCGPA).reversed()
         .thenComparing(Student::getName)
         .thenComparing(Student::getId)
     );
     
     List<Student> getStudents(List<String> events) {
         
         for (String event: events) {
             String[] words = event.split("\\s+");
             if ("ENTER".equals(words[0])) {
                 this.q.add(new Student(Integer.parseInt(words[3]), words[1], Double.parseDouble(words[2])));
             } else if ("SERVED".equals(words[0])) {
                 this.q.poll();
             }
         }
         
         List<Student> students = new ArrayList<Student>(this.q);
         students.sort(
             Comparator.comparing(Student::getCGPA).reversed()
             .thenComparing(Student::getName)
             .thenComparing(Student::getId)
         );
         return students;
     }
 }