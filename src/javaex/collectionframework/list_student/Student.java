package javaex.collectionframework.list_student;

public class Student implements Comparable{
    private String name;
    private int classNum;
    private int no;
    private int kor,eng, math;

    public Student(String name, int classNum, int no, int kor, int eng, int math) {
        this.name = name;
        this.classNum = classNum;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAvg() {
        return getTotal() / 3.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classNum=" + classNum +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", Total = " + getTotal() +
                ", Average = " + getAvg()+
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return name.compareTo(student.name);
        } else {
            return -1;
        }
    }
}
