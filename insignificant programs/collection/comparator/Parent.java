

public class Parent {
    String name;
    int age;
    Parent(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
   public String toString(){
        return name+" is "+age+" yo.";
    }

}
class Son extends Parent{

    Son(String name, int age) {
        super(name, age);
    }

}


class Daughter extends Parent{

    Daughter(String name, int age) {
        super(name, age);
    }

}
