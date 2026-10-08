package SelectionStatements;

public class unary_if_else {

    public static void main(String[] args) {
        int marks = 89;

        String result = (marks >= 90) ? "Grade A"
                : (marks >= 80) ? "Grade B"
                        : (marks >= 70) ? "Grade C"
                                : (marks >= 60) ? "Grade D"
                                        : (marks >= 50) ? "Grade E" : "Fail";

        System.out.println(result);

    }
}