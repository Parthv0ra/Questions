public class solidrhombus {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=m; j++){
                if(i == 1 || j == 1 || j == m || i == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
