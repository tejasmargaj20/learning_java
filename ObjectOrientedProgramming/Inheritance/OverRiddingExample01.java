public class OverRiddingExample01 {
    public static void main(String[] args) {

        FulltimeEmployee obj = new FulltimeEmployee();
        obj.baseSalary = 1000;
        obj.name = "Tejas";
        obj.bonus = 300.00;
        obj.calculateSalary();
        obj.showDetails();

    }
}

class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;

    }

    public void showDetails() {
        System.out.println("Employee:" + name + ", Salary:" + calculateSalary());

    }
}

class FulltimeEmployee extends Employee {

    double bonus;

    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee:" + name + ", Salary:" + calculateSalary());

    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee:" + name + ", Salary:" + calculateSalary());

    }
}

class TemporaryEmployee extends Employee {

    int daysWorked;
    double dailyrate;

    public double calculateSalary() {
        return daysWorked * dailyrate;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee:" + name + ", Salary:" + calculateSalary());

    }
}