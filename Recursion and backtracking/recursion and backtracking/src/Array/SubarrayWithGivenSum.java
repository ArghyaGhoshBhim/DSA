package Array;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
/**
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        outerloop:
        for(int i=0;i<n;i++){
            ans.clear();
            ans.add(i+1);
            sum=0;
            for (int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>s){
                    break;
                }
                if(sum==s){
                    ans.add(j+1);
                    break outerloop;
                }
            }

        }
        return ans;

    }
 **/
static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
    ArrayList<Integer>ans=new ArrayList<>();
    int start=0;
    int end=0;
    int sum=arr[0];
    if(sum==s){
        ans.add(1);
        ans.add(1);
        return ans;
    }
    while(end<n-1){

        if((sum+arr[end+1])<=s){
            end+=1;
            sum+=arr[end];
        }else {
            sum-=arr[start];
            start+=1;
        }
        if(sum==s){
            ans.add(start+1);
            ans.add(end+1);
            return ans;
        }

    }

    ans.add(-1);
    return ans;
}




    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(arr, 10, 15));
    }
}
