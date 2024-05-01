class A {
private int y;
public void set(int x)
{
    y=x;
    
}    

public  int get(){
    return y;
}
}
public class B{
    public static void main(String[] args) {
        A r = new A();
        r.set(100);
        System.out.println(r.get());

    }
}
