package loopss.src;

import java.util.HashSet;
import java.util.Set;

public class subsequence {
    public static void printseq(String str,String newstring,int idx,HashSet<String> set) {
        if(idx == str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        
        char currChar = str.charAt(idx);

        printseq(str, newstring+currChar, idx+1,set);

        printseq(str, newstring, idx+1,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printseq(str, "", 0,set);
    }
}
