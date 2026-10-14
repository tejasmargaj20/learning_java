package ObjectOrientedProgramming;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
        System.out.println("Constructor called......");

    }

    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor Called");
    }

    void details() {
        System.out.println("Name :" + name + " " + "Salary :" + salary);
    }

    public static void main(String[] args) {

        Employee obj_1 = new Employee("Tejas", 500000);
        Employee obj_2 = new Employee("Tejas", 500000);
        obj_1.details();
        obj_2.details();
        obj_2.name = "Raj";
        obj_2.details();

    }
}
