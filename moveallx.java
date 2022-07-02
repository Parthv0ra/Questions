package loopss.src;

public class moveallx {
    public static void movex(String str,int idx,int counter,String newString) {

        if(idx == str.length()){
            for(int i=0;i<counter;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            counter++;
            movex(str, idx+1, counter, newString);
        }else{
            newString += currChar;
            movex(str, idx+1, counter, newString);
        }
        
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        movex(str, 0, 0, "");
        
    }
}
