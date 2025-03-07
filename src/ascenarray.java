import java.util.Scanner;
public class ascenarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
            
    }
}