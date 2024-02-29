public class Main {
    public static void main(String[] args) {

        int speed = 100;
        if (speed > 75) {
            System.out.println("Over Speed, Ticket printed");
        }

        int balance = 50;
        if (balance < 100) {
            System.out.println("Your account balance is low");
        }

        int x = 11;
        int y = 12;
        if (x > 10 && y > 10) {
            System.out.println("x and y are greater than 10");
        }
        if (x > 10 || y > 20) {
            System.out.println("x or y is greater than 10");
        }

        int age = 10;
        if (age >= 18) {
            System.out.println("Welcome, Access granted");
        } else {
            System.out.println("Sorry, Access denied");
        }

        int score = 63;
        if (score >= 92) {
            System.out.println("Grade=A");
        } else if (score >= 85) {
            System.out.println("Grade=A-");
        } else if (score >= 80) {
            System.out.println("Grade=B+");
        } else if (score >= 75) {
            System.out.println("Grade=B");
        } else if (score >= 70) {
            System.out.println("Grade=B-");
        } else if (score >= 65) {
            System.out.println("Grade=C");
        } else {
            System.out.println("Grade=F");
        }

        int totalMarks = 30;
        if (totalMarks > 60) {
            System.out.println("First Class");
        } else if (totalMarks > 40) {
            System.out.println("Second Class");
        } else {
            System.out.println("Third Class");
        }

        // SWITCH CASE:

        String boardingClass = "A";
        switch (boardingClass) {
            case "A":
                System.out.println("You're first to board the flight");
                break;
            case "B":
                System.out.println("You're second to board the flight");
                break;
            case "C":
                System.out.println("You're last to board the flight");
                break;
        }
    }
}
