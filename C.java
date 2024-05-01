import java.util.*;
interface A1 {
    void print();
    void display();
}

 class B implements A1 
 {

    public void print(){
        System.out.println("hello");
    }
    public void display(){
        System.out.println("welcome");
    }
}

 class C {
   public static void main(String args[]){
    B b=new B();
    b.print();
    b.display();
   }
    
}