package conditonal;

import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNum;

        System.out.println("enter your number between (1 to 7) for day ");
        dayNum = scanner.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thrusday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;
        
            default:
                System.out.println("paagl hai kay :)");
                break;
        }

        scanner.close();

    }
}
