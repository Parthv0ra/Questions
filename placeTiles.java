public class placeTiles {
    public static int tiles(int n,int m) {
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }
        int horizontalplacement = tiles(n-1,m);
        int verticalplacement = tiles(n-m,m);
        return horizontalplacement + verticalplacement;
    }
    public static void main(String[] args) {
        int n = 4;
        int m=2;
        System.out.println(tiles(n,m));
        
    }
}
