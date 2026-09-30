import java.util.Scanner;

public class IT26101296Lab10Q1a { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark (0 - 100): ");
        int mark = scanner.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        scanner.close();
    }
}