import java.util.*;
public class ifelseladdeer {
    public static void main(String[] args) {
        int a,b,c,d,e,sum;
        Scanner j=new Scanner(System.in);
        a = j.nextInt();
        b = j.nextInt();
        c = j.nextInt();
        d = j.nextInt();
        e = j.nextInt();
        sum=a+b+c+d+e;
        System.out.println("sum :"+sum);
        int per=sum/5;
        System.out.println("percentage : "+per);
        if(per>=60)
        {
            System.out.println("A");
        }
        else if(per<60 && per>=45)
        {
            System.out.println("B");
        }
        else if(per>45 && per>33){
            System.out.println("C");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
