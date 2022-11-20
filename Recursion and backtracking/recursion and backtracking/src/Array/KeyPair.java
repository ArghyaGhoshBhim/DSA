package Array;

import java.util.HashMap;

public class KeyPair {
    static  boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashMap<Integer, Integer>map=new HashMap<>();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(map.containsKey(x-arr[i])){
                return true;
            }
            map.put(arr[i], i);
        }
        return flag;
    }

    public static void main(String[]args){
        int X = 11;
        int Arr[] = {1, 2, 4, 3, 6};
        System.out.println(hasArrayTwoCandidates(Arr, Arr.length, X));
    }
}
