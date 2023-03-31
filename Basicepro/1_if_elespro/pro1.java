import java.util.*;

class pro1{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number a and b , c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b){
            System.out.print("a is largest number" +a);
        }
        else if (b>c){
            System.out.print("b is largest number" +b);

        }
        else{
            System.out.print("c is largest number" +c);
        }

        sc.close();

    }
}