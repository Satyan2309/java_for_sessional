// class untitled1{
//     void show()
//     {
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         untitled1 r= new untitled1();
//         untitled1 r1= new untitled1();
//         System.out.println(r);
//         r.show();
//     }
// }

/**
 * untitled1
 */
// public class untitled1 {

//     int a; //instance variable
//     untitled1(int a){ // local variable
//       this.a=a;
//     }
//     void show()
//     {
//         System.err.println(a);
//     }
//     public static void main(String[] args) {
//         untitled1 e =new untitled1(42);
//         e.show();
//     }
// }
/**
 * untitled1
 */
// public class untitled1 {

//     untitled1(){
//         System.out.println("java");
//     }
//     untitled1(int a,int b){
//         this();
//         System.out.printf("%d %d",a,b);
//     }
//     public static void main(String[] args) {
//         untitled1 r =new untitled1(1,2);
//     }
// }
/**
 * untitled1
 */
public class untitled1 {

    public static void main(String[] args) {
        untitled1 e =new untitled1();
        int a=30,b=30,c=30;
        if(a>b  && a>c)
        {
            System.out.println("a");
        }
        else if(b>a && b>c){
            System.out.println("b");
        }
        else
        {
            System.out.println("c");
        }
    }
}