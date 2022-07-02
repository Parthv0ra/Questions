import java.util.Scanner;

public class countingZeros {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        System.out.println("press 1 to continue or stop");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input==1){
            System.out.println("enter ur nubmber");
            int nubmber = sc.nextInt();

            if(nubmber > 0){
                positive ++;

            }else if(nubmber < 0){
                negative ++;
            }else{
                zeros++;
            }

            System.out.println("press 1 to contnue or stop");

            input = sc.nextInt();
        }

        System.out.println("positive "+positive);
        System.out.println("negative "+negative);
        System.out.println("zeros "+zeros);
    }
}
