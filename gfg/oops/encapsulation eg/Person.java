/* 

Your task is to create a Person class in Java that demonstrates encapsulation.
This class should have two private attributes: name( String ) and age( int ) whose default values should be name as "Geeks" and age as 10.
The class should provide public getter and setter methods to access and modify these private attributes.

Input: Funtion calls: [Person(), getName(), setName("John"), setAge(21), getName(), getAge()] 
Output: Geeks John 21
Explanation: 
Person person = new Person() // Person Object Created
person.getName() // Default value "Geeks" returned
person.setName("John") // name value set to "John"
person.setAge(21) // age value set to 21
person.getName() // "John" returned
person.getAge() // 21 returned

*/

// User function Template for Java
//  Write the complete Person class here
class Person  {
    private int age = 10;
    private String name = "Geeks";
    
    public  void setAge(int age){
        this.age = age;
    }
    
    public  void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
    public static void main(String[] args){
        Person person = new Person();
        System.out.print(person.getName()+" ");
        person.setName("John");
        person.setAge(21);
        System.out.println(person.getName()+" "+person.getAge());
    }
}