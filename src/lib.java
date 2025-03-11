class book{
    String title;
    String author;
    int ISBN;
    void displaydetail(){
        System.out.println(+title);
        System.out.println(+author);
        System.out.println(+ISBN);
    }
}
class ebook extends book{
    int filesize;
    @Override displaydetail(){
        

    }
}
public class lib {
    
}
