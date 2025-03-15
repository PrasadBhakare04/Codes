package _11Generics._3ObjectComparison;

public class Student implements Comparable<Student>{
    int roll;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    Student(int marks, int roll){
        this.marks = marks;
        this.roll = roll;
    }


    @Override
    public int compareTo(Student O) {
        int diff = (int)(this.marks - O.marks);
        return diff;
    }
}
