import java.util.Scanner;

public class PrintHi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = 5;
        for (int i = 1; i <= 10; i++) { 
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
