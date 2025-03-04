import java.util.Scanner;

public class CheckZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (String.valueOf(number).contains("0")) {
            System.out.println("Zero exists in the number.");
        } else {
            System.out.println("Zero does not exist in the number.");
        }
        
        scanner.close();
    }
}

