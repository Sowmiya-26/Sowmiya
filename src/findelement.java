import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ext=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(a[i]==ext)
            {
                System.out.println(+i);
            }
        }
    }
}
