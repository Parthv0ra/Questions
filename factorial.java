package loopss.src;

public class factorial {
    public static void calulatefactorial(int n, int sum) {
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        calulatefactorial(n-1, sum);
        
    }
    public static void main(String[] args) {
        calulatefactorial(5, 0);
        
    }
    
}
