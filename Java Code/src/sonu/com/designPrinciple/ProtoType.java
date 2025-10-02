package sonu.com.designPrinciple;

class Student implements Cloneable {
    String name;

    Student(String name) {
        this.name = name;
    }

    public Student clone() {
        try {
            return (Student) super.clone(); // copy object
        } catch (Exception e) {
            return null;
        }
    }
}

public class ProtoType {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = s1.clone(); // copy of s1

        System.out.println(s1.name); // Rahul
        System.out.println(s2.name); // Rahul (cloned)
    }
}

