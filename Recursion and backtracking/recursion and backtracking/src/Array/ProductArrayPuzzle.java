package Array;

public class ProductArrayPuzzle {

    public static long[] productExceptSelf(int nums[], int n){

        int cntZero=0;
        long mul=1;
        long[]ans=new long[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            mul=mul*nums[i];
            else {
                cntZero++;
            }
        }

        if(cntZero>1){
            return ans;
        }
        if(cntZero==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i]=mul;
                }
            }
        }else {
            for(int i=0;i<n;i++){
                ans[i]=mul/nums[i];
            }
        }
        return ans;
    }

    public static void main(String[]args){
        int nums[] = {12, 0};
        long[]ans=productExceptSelf(nums, nums.length);
        for(long ele:ans){
            System.out.println(ele);
        }
    }
}
