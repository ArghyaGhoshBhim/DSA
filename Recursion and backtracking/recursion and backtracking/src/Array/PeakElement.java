package Array;

public class PeakElement {

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int result=solve(arr, n, 0, n-1);
        return result;
    }

    public static int solve(int[]arr, int n, int low, int high){
        int mid=low+(high-low)/2;

        if((mid==0 && arr[mid]>arr[mid+1])||(mid==n-1 && arr[mid]>arr[mid-1])){
            return mid;
        }else if(mid>0 && arr[mid]<arr[mid-1]){
            return solve(arr, n, low, mid-1);
        }else{
            return solve(arr, n, mid+1, high);
        }
    }

//    public static int solve1(int[]arr, int n, int low, int high){
//
//    }


    public static void main(String[]args){
        int[]arr={5,2, 0, 8,3};
        int n=5;
        System.out.println(peakElement(arr, n));
    }
}
