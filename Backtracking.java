public class Backtracking {


    public static void printpermutation(int idx,String perm,String str) {

        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printpermutation(idx+1, newstr, perm+currchar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(0, str, "");
        
    }
}
