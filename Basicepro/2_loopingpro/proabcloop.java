public class proabcloop {
    public static void main(String[] arg) {
        int n=5 ;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==(n-1)/2||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println(" ");
            
        }
        System.out.println(" ");


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==(n-1)/2||j==n-1||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println(" ");
        }

        System.out.println(" ");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==(n-1)/2||j==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println(" ");
        }
        
    }
}
