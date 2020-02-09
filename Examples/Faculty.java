package Examples;

public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty(){
        System.out.println("(4) Perform faculty tasks");
    }
}

class Employee extends Person{
    public Employee(){
        this("(2) Invoke Employees's overloaded constructor");
        System.out.println("(3) performs employees's tasks");
    }

    public Employee(String s){
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("(1) Performs Examples.Person's tasks");
    }
}
