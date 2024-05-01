interface A1 {
     void web_designing();
     void web_development();
}

 abstract class c2  implements A1{

   public void web_designing(){
        System.out.println("hello");
    }
}
 class Btech2 extends c2{
public void web_development(){
    System.out.println("welcome");
}
 }
public class C3{
    public static void main(String[] args) {
        Btech2 b = new Btech2();

        b.web_designing();
        b.web_development();
    }
}
    
