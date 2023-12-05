package conditonal;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your income ");
        float income = scanner.nextFloat();
        float taxPaid = 0.0f;

        if (income >= 250000 && income <= 500000) {
             taxPaid = (income / 5.0f) * 100;
        }
        else if (income > 500000 && income <= 1000000) {
             taxPaid = (income / 20.0f) * 100 ;
        } else {
             taxPaid = (income / 30.0f) * 100 ;
        }

        System.out.println(taxPaid);

        scanner.close();
    }
}
