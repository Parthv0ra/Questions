package loopss.src;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("parth");

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - i - 1;
            
            char fronchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, fronchar);
            
        }
        System.out.println(sb);



    }
}
