package conditonal;
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("eligible to drive");
        }else{
            System.out.println("not eligible");
        }

        scanner.close();
    }
}
