import java.util.Scanner;

public class proloop1 {

    public static void main(String[] arg) {
        int n ;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an number for loop n =");
        n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");

            }
            System.out.println("* ");
        }
    }
    
}
