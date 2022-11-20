package Array;

import java.util.HashMap;

public class CountsPairsGivenSum {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int cnt=0;
        HashMap<Integer, Integer>map=new HashMap<>();
        int result=0;
        for(int i=0;i<n;i++){
            int ele=k-arr[i];
            if(map.containsKey(ele)){
                result+= map.get(ele);
            }

            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.replace(arr[i], map.get(arr[i])+1);
            }

        }
        return result;
    }
}
