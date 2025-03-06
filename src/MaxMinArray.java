import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        scanner.close();
        
        int max= a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum value"+max);
        System.out.println("Minimum value"+min);
    }
}
