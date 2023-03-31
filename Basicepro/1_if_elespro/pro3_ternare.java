import java.util.Scanner;

public class pro3_ternare {
    
    public static void main(String[] arg){

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a,b and c:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int ad = (a<b)? ((a>c) ? a:c) : ((b<c) ? b:c) ;
        System.out.println("grater number is " +ad);
        sc.close();
    }
}
