import java.util.*;
public class arr {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int arr[]=new int[5];
        // int arr[];

        // int arr[]={7,6,7,8};
        int l;
        System.out.println("Enter the size: ");
        l=c.nextInt();
        System.out.println("Enter the elements: ");

        for(int i=0;i<l;i++)
            arr[i]=c.nextInt();
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" " );
        }
        System.err.println();

        for(int i=l-1;i>=0;i--){
            System.out.print(arr[i]+" " );
        
    }}
    
}