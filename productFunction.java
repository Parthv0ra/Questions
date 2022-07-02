import java.util.*;
public class productFunction {

    // public static int product(int a,int b){
    //     int mul = a*b;
    //     return mul;
    // }

    // public static void printFactorial(int n){
        
    //     if(n<1){
    //         System.out.println("Inavalid Number");
    //         return;
    //     }
    //     int factorial = 1;
    //     for(int i=n;i>=1;i--){
    //         factorial = factorial * i;
    //     }

    //     System.out.println(factorial);
    //     return;
    // }

    public static int isPrime(int n){
        if(n%2!=0){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
            
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }
}
