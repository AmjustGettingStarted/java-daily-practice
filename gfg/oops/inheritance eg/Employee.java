/*
Implement the following classes to understant Inheritance in Java:
Note: Driver code makes all the function calls and print statements

Name: Employee
Data member/Attributes: id (int), salary (int)
Constructor: Employee(id,salary) -> Initializes values to respective variables 
Name: SalesEmployee (extends Employee)
Data member/Attributes: sales (int)
Constructor: SalesEmployee(id,salary,sales) -> calls super(id,salary) and initialzes value to sales
Example:

Input: id = 14, salary = 30000, sales = 20
Output: 
14 30000
14 30000 20
*/


class Employee{
    int id;
    int salary;
    Employee(int id, int salary){
        this.id = id;
        this.salary = salary;
    }
}

class SalesEmployee extends Employee{
    int sales;
    
    SalesEmployee(int id, int salary, int sales){
        super(id, salary);
        this.sales = sales;
    }
}