package Array;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    static int maxLen(int arr[], int n)
    {
        // Your code here
        int currentSum=0;
        int sum=0;
        int largest=0;
        int start=0;int end=-1;
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum-sum==0){
                if(largest<i+1){
                    largest=i+1;
                }
                continue;
            }

            if(map.containsKey(currentSum-sum)){
                start=map.get(currentSum-sum)+1;
                end=i;
                if(largest<end-start+1){
                    largest=end-start+1;
                }
                continue;
            }
            map.put(currentSum-sum, i);
        }

        return largest;
    }


    public static void main(String[]args){
        int A[] = {15,-2,2,-8,1,7,10,23};

        System.out.println(maxLen(A, A.length));
    }
}
