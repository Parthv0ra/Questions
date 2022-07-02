import java.util.*;
package loopss.src

public class fibonacci {

    public static int printFibonacci(int a, int b){
        int a = 0;
        int b = 1;

        if(n>1){
            for(int i=2;i<=n;i++){
                int temp = b;
                b=a;
                a=b;
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(printFibonacci(a, b));
    }


    
}

// import java.util.*;
 
// public class Solutions {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
      
//        int a = 0, b = 1;
          
//        System.out.print(a+" ");
      
//        if(n > 1) {
//            //find nth term
//            for(int i=2; i<=n; i++) {
//                System.out.print(b+" ");
//                //the concept below is called swapping
//                int temp = b;
//                b = a + b;
//                a = temp;
//            }
 
//            System.out.println();
//        }
//    }   
// }
