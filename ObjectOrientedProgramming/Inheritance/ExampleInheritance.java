public class ExampleInheritance {

    OverloadingExample obj = new OverloadingExample();System.out.println("Add method with 3 parameters: "+

    obj(10,20,30));

}

class OverloadingExample extends ExampleInheritance {

    public int add(int a, int b, int c) {
        
        return a + b + c;
    }

    public int add(int a, int b) {
        System.out.println("Add method with 2 parameters: " + (a + b));
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Add method with 2 parameters: " + (a + b));
        return a + b;
    }
}
