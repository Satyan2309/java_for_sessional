abstract class A {
abstract void print();
void show(){
    System.out.println("hello");
}
    
}

class B extends A{
void print(){
    System.out.println("welcome");
}
    
}

public class c1 {
    public static void main(String[] args) {
         B  b= new B();
         b.print();
    }
}
