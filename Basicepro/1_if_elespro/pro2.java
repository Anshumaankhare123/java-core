import java.util.*;

public class pro2 {
    public static void main(String[] arg) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number a and b:-");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            if(a%2==0){
                System.out.println("Even Number = " +a );
            }
            else{
                System.out.print("Not a Even Number = " +a);
            }

        }

        else{
            if(b%2==0){
                System.out.println("Even Number = " +b );
            }
            else{
                System.out.print("Not a Even Number = " +b);
            }
        }
        sc.close();

        
    }
    
}
