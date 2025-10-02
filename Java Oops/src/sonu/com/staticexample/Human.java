package sonu.com.staticexample;


import sonu.com.Constructer;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
   static long population;

    public Human(int age, boolean married, int salary, String name) {
        this.age = age;
        this.married = married;
        this.salary = salary;
        this.name = name;

       // this.population += 1;
        Human.population += 1;
    }
}
