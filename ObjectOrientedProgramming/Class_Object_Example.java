package ObjectOrientedProgramming;

class Dog {
    // String name = "Rocky";
    String name;

    void bark() {
        System.out.println(name + " Bark...!!!");
    }

}

public class Class_Object_Example {
    public static void main(String[] args) {

        Dog obj = new Dog();
        // obj.bark();

        Dog rocky = new Dog();
        rocky.name = "Rocky";
        rocky.bark();

    }
}
