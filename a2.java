class a {
    void set(){
        System.out.println("hello");
    }
}

class b extends a{
    void set(){
        super.set();
        System.out.println("well");
    }
}
public class a2 {

    public static void main(String[] args) {
        a A =new b();
        A.set();
    }
}