package loopss.src;

public class issorted {
    public static boolean sorted(int arr[],int idx) {
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx]>=arr[idx+1]){
            return false;
        }else{
            return sorted(arr, idx+1);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(sorted(arr, 0)); 


        
    }
}
