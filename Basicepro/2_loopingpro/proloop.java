import java.util.*;

public class proloop {
    public static void main(String[] args) {
    //loop work in this flie of java
    
    int i,a,b,c,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number n = ");
    n=sc.nextInt();
    sc.close();
    
    for(i=0;i<=n;i++){
        System.out.println("enter a number =");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("inserted number =" +a +b +c);
    }
    
    

    }
}
