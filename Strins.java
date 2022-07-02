import java.util.*;

public class Strins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is "+name);
        System.out.println(name.length());

        for(int i=0;i<=name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
}
