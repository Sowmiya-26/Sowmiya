class math{
    void formula(){
        System.out.println("math formula");
    }
}
class chem extends math{
    void chemical(){
        System.out.println("chem formula");
    }
}

public class level {
    public static void main(String[] args) {
        chem obj = new chem();
        obj.formula();
        obj.chemical();
        
    }
}
