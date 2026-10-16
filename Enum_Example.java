public class Enum_Example {
    enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thrusday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        Day today = Day.Friday;

        switch (today) {
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            case Wednesday:
                System.out.println("wednesday");
                break;
            case Thrusday:
                System.out.println("Thursday");
                break;
            case Friday:
                System.out.println("Friday");
                break;
            case Saturday:
                System.out.println("Saturday");
                break;
            case Sunday:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("");
                break;

        }
    }

}
