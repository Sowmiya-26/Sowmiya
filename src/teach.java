class staff{
    String name;
    String destination;
    int salary;
    void displaydetail(){
        System.out.println(name);
        System.out.println(destination);
        System.out.println(salary);
    }
}
class teaching extends staff{
    String subject;
    void conduct(String subject){
        System.out.println(subject);
    }

}
class nonteaching extends staff{
    String dept;
    void managework(String dept){
        System.out.println(dept);
    }
    
}
public class teach {
    public static void main(String[] args) {
        teaching te = new teaching();
        te.conduct("CN");
        nonteaching nt = new nonteaching();
        nt.managework("mech");
    }
}
