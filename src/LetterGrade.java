import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");

        String name = input.next();

        System.out.println("Hello " + name);

        System.out.println("Please enter your exam score (Between 0-100) ");

        int score = input.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Congratulations AA");
        } else if (score >= 60 && score <= 80) {
            System.out.println("Congratulations BB");
        } else if (score >= 50 && score <= 60) {
            System.out.println("Congratulations CC");
        } else if (score >= 45 && score <= 50) {
            System.out.println("Scrape through the exam DD :) ");
        } else if (score >= 25 && score <= 45) {
            System.out.println("Sorry, fail the exam EE");
        } else if (score >= 0 && score <= 25) {
            System.out.println("Sorry, fail the exam FF");
        } else {
            System.out.println("Please try again");
        }
    }
}