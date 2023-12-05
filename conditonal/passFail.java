package conditonal;

import java.util.Scanner;

public class passFail {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for physics");
        int marks1 = scanner.nextInt();

        System.out.println("Enter marks for chemistry");
        int marks2 = scanner.nextInt();

        System.out.println("Enter marks for maths");
        int marks3 = scanner.nextInt();

        int totalMarks = marks1 + marks2 + marks3;

        float percentage = (totalMarks / 300.0f ) * 100 ;

        System.out.println(percentage);

        scanner.close();
    }
}
