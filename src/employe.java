class empl{
    int empid;
    String empname;
    empl(int d,String s)
    {
        empid=d;
        empname=s;
    }
    void display()
    {
        System.out.println("employee Id:"+empid);
        System.out.println("employee Name:"+empname);
    }
}
public class employe {
    public static void main(String[] args) {
        empl oby=new empl(5000,"naveen");
        oby.display();

    }
}
