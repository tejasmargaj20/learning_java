package SelectionStatements;

public class Grades {
    public static void main(String[] args) {

        int marks = 98;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade c");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
