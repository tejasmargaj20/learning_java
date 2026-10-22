public class OverRiddingExample {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 10));
        System.out.println(obj.add(10, 10, 10, 10, 10));
        System.out.println(obj.add(10, 10, 10, 10));
        System.out.println(obj.add(10, 10, 30, 10));
        System.out.println(obj.add(10, 10));

    }
}

class Calculator {

    public int add(int... numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;

        }
        return sum;
    }
}