class raju{
    int i=0;
    raju( int i){
        this.i = i;
    }
    void show() {
        int i = 10;
        System.out.println(this.i);
    }
}

public class thiskey {
    public static void main(String[] args) {
        raju a = new raju(100);
        a.show();
    }
}
