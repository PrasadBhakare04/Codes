package _11Generics._3ObjectComparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(99,1);
        Student s2 = new Student(77,2);
        Student s3 = new Student(86,3);
        Student s4 = new Student(54,4);

        Student[] students = {s1, s2, s3, s4};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
//        if(s1.compareTo(s2) > 0){
//            System.out.println("s1 has more marks");
//        }

    }
}
