package loopss.src;

public class calcpower {
    public static int calcpow(int x, int n) {
        if(x == 0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return calcpow(x, n/2) * calcpow(x, n/2);
        }else{
            return calcpow(x, n/2) * calcpow(x, n/2) * x;
        }
        // int xpow1 = calcpow(x,n-1);
        // int xpow = x * xpow1;
        // return xpow;

    }
    public static void main(String[] args) {
        int ans = calcpow(2, 5);
        System.out.println(ans);
        
    }
}
