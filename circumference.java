import java.util.Scanner;

public class circumference {

    public static double getCircumference(Double r){
        double area;
        area = 3.14 * (r*r);
        return area;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.println(getCircumference(r));
        
    }
}
