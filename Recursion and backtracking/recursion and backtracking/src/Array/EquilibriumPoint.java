package Array;

import java.util.ArrayList;

public class EquilibriumPoint {
/**
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        solve(arr, n, 0, 0,0,ans);
        return ans.get(0);
    }

    public static long solve(long[]arr, int n, long bsum, long asum, int index,    ArrayList<Integer>ans){
        if(index==n-1){
            return arr[n-1];
        }
        asum+=arr[index];
       bsum= solve(arr, n, bsum, asum, index+1, ans);
        bsum+=arr[index];
        if(bsum==asum){
            ans.add(index+1);
        }
        return bsum;
    }
**/
public static int equilibriumPoint(long arr[], int n) {

    // Your code here
    int index=0;
    long sum=0;
    long totlaSum=0;
    for(int i=0;i<n;i++){
        totlaSum+=arr[i];
    }
    while (totlaSum>sum){

        totlaSum-=arr[index];
        if(totlaSum==sum){
            return index+1;
        }
        sum+=arr[index];
        index++;
    }
    return -1;
}


    public static void main(String[]args){
       long A[] = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A,5));
    }


}
