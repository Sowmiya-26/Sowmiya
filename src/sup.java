class car {
    int speedlimit =120;
}
class audi extends car{
    int speedlimit = 180;
    void show(){
        System.out.println("speed limit is "+ super.speedlimit);
        System.out.println("local "+ speedlimit);
    }
}
public class sup {
    public static void main(String args[]){
        audi m = new audi();
        m.show();
    }
    
}
