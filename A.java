// public class A {
//     int a;String name;
//     A()
//     {
//         System.out.println(a+" "+name);             //Constructor creation
//     }
//     public static void main(String[] args) {      
//         A a= new A();
//     }
// }
public class A {
    int a;String name;
    A()
    {
        a =10;
        name="Ankit";            //Constructor creation
    }
     void show()
    {
        System.out.println(a+" "+name); 
    }
    public static void main(String[] args) {      
        A a= new A();
        a.show();
    }
}

