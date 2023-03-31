import java.util.*;;

public class proloop2 {
    public static void main(String[] arg) {
        int n ;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an number for loop n =");
        n = sc.nextInt();
        sc.close();
        for(int i=0;i<=n+1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println(" ");
        }

        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }

}
