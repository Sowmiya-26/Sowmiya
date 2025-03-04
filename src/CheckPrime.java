import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 1) {
            System.out.println(number + " is not a Prime number.");
        } else {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number + " is a Prime number.");
            } else {
                System.out.println(number + " is not a Prime number.");
            }
        }
        
        scanner.close();
    }
}
