package org.tnsif.acc.c2tc.oops;

class User1 {
    String name;
    int age;

    // Default constructor
    User1() {
        name = "Bhoomi";
        age = 20; // assigning a default age
        System.out.println("Welcome");
    }

    // Parameterized constructor
    User1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Name = " + name + ", Age = " + age);
    }
}

public class ParameterizedConst {
    public static void main(String[] args) {
        // Using default constructor
        User1 user1 = new User1();
        System.out.println(user1.name + " " + user1.age);

        // Using parameterized constructor
        User1 user2 = new User1("Bhoomika", 21);
        System.out.println(user2.name + " " + user2.age);
    }
}

