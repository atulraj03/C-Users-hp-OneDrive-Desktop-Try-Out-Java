package string;
import java.util.Scanner;
public class ReplaceSpaceWithUnderscor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string value? ");
        String inpuString = scanner.nextLine();

        String outputString = inpuString.replace(" ", "_");

        System.out.println(outputString);

        scanner.close();
    }
}
