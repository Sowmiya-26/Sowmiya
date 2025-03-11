import java.util.*;
class bankaccount{
    int accountnumber;
    int balance;
    void deposit(int d){
        balance = d + balance;
        System.out.println(balance);
    }

}
class savingsaccount extends bankaccount{
    
    void addinterest(int r){
        r = (r*balance)/100;
        System.out.println(r+balance);
    }
    
}
public class bank {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int money=sc.nextInt();
        // int r =sc.nextInt();
        savingsaccount obj = new savingsaccount();
        obj.deposit(2000);
        obj.addinterest(2);
        

    }
    
}
