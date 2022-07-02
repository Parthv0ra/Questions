package loopss.src;

public class recursionReveString {
    public static void printrev(String str,int inx) {
        if(inx == 0){
            System.out.println(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        printrev(str, inx - 1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.length());
        printrev(str, str.length()-1);
        
    }
}
