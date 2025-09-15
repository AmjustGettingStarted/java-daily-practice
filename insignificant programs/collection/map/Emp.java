package List.Map;

public class Emp implements Comparable<Emp>{
    int age ;
    String name;

    Emp(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name+" is " + age + " years old.";
    }

    @Override
    public int compareTo(Emp emp){
        return this.age - emp.age;

    }
}
