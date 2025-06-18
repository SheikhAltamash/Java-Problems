public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        child1 one = new child1();
        one.show();
        System.out.println();
        new child2();
        System.out.println();
        new child3();
        System.out.println();
        child4 four = new child4();
        four.greet("hello world");
        System.out.println();
        System.out.println();
    }

}
// The Super Keyword is used to refer to the parent class of the current object
// It Allows a subckass to directly access its parent's method , constructor, or
// instance variable, even when they are overridded in the subclass

// Key use case of the Super Keyword
// 1) Access PArent Class Methods
class Parent1 {
    void display() {
        System.out.println("Parent class display Method ");
    }
}

class child1 extends Parent1 {
    void display() {
        System.out.println("Child class display Method ");

    }

    void show() {
        super.display();
        System.out.println("Child class show ");
    }
}

// 2) Access Parent class Variable
class Parent2 {
    String surName = "Gupta";
}

class child2 extends Parent2 {
    String name = "Ravi ";

    child2() {
        System.out.println(name + super.surName);
    }
}

// 3) Invoke Parent class Constructor

class Parent3 {
    Parent3(String message) {
        System.out.println("Parent Constructor : " + message);
    }
}

class child3 extends Parent3 {
    child3() {
        super("Hello ji kaise ho sare !");
        System.out.println("Child Constructor");
    }
}

// 4) Invoke Parent class Paramaterized method

class Parent4 {
    void greet(String greet) {
        System.out.println("Parent says : " + greet);
    }
}

class child4 extends Parent4 {
    void greet(String greet) {
        super.greet(greet);
        System.out.println("Child Says : " + greet);

}
}
