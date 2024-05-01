import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
    char c;
int  a,b;
Scanner s=new Scanner(System.in);

System.out.println("Enter the operation +,-,/,*");
 c = s.next().charAt(0);
 System.out.println("Enter the operation two values");
 a =s.nextInt();
b =s.nextInt();

    switch (c) {
        case '+':
            System.out.println(a+b);
            break;

         case '/':
            System.out.println(a/b);

            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
    
        default :
        System.out.println("You enter the wrong operation+ Please retenter the operation");
            break;
    }
   } 

}
