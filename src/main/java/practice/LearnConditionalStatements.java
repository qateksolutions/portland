package practice;

public class LearnConditionalStatements {
    public void switchStatement(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Great!");
                break;
            case 'C':
                System.out.println("Well Done!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Try next time");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        System.out.println("Your Grade is: " + grade);
    }

    public void learnIfElse(char grade) {
        String result = "Invalid Grade";
        if (grade == 'A') {
            result = "Excellent!";
        } else if (grade == 'B') {
            result = "Great!";
        } else if (grade == 'C') {
            result = "Well Done!";
        } else if (grade == 'D') {
            result = "You passed";
        } else if (grade == 'F') {
            result = "Try next time";
        } else {
            System.out.println(result);
        }
        System.out.println(result);
        System.out.println("Your Grade is: " + grade);
    }

    public void gradeResults(char grade) {
        String result;
        result = (grade == 'A') ? "Excellent!" : "Invalid Grade";
        result = (grade == 'B') ? "Great!" : "Invalid Grade";
        result = (grade == 'C') ? "Well Done!" : "Invalid Grade";
        result = (grade == 'D') ? "You passed" : "Invalid Grade";
        result = (grade == 'F') ? "Try next time" : "Invalid Grade";
        System.out.println(result);
        System.out.println("Your Grade is: " + grade);
    }


    public void conditionalOperator() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("value of b is: " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("value of b is: " + b);
    }

}
