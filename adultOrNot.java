import java.util.*;
public class adultOrNot {

    public static boolean adult(int n){
        if(n>18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(adult(n));
        
    }
}
