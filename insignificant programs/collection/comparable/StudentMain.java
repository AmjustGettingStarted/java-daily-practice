import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student(20);
        Student s2 = new Student(22);
        Student s3 = new Student(18);
        Student s4 = new Student(21);

        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(new Student(23));

        for(Student stu : ts){
            System.out.println(stu);
        }

    }
}
