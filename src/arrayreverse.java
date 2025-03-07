import java.util.Scanner;

public class arrayreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int l=n-1;
        int f=0;
        while(f<l)
        {
            int temp= a[f];
            a[f]=a[l];
            a[l]=temp;
            f++;
            l--;
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]);
        }
    }
}