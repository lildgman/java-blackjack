package javaex.set;

public class Student /*implements Comparable<Student>*/{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", age = " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Student o) {
////        return this.name.compareTo(o.getName());
//        if (this.age > o.getAge()){
//            return 1;
//        } else if(this.age < o.getAge()){
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
