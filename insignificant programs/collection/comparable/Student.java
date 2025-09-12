package collection.comparable;

public class Student implements Comparable<Student> {
    int age;
    Student(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "AGE: "+ age;
    }

    @Override
    public int compareTo(Student s){
        return s.age - this.age;
    }
}
