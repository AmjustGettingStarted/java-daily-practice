
public class Person implements Comparable<Person> {
    Integer age;
    String name;
    Double sal;

    Person(Integer age, String name, Double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return name + " is of " + age + " yo and earns Rs." + sal;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
