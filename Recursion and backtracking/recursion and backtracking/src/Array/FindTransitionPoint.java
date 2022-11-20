package Array;

public class FindTransitionPoint {
    static int transitionPoint(int arr[], int n) {
        // code here
        int l=0;
        int r=n-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==0 && arr[mid+1]!=1){
                l=mid+1;
            }
            if(arr[mid]==1 && arr[mid-1]!=0){
                r=mid-1;
            }
            if(arr[mid]==1 && arr[mid-1]==0){
                return mid;
            }
            if(arr[mid]==0 && arr[mid+1]==1){
                return mid+1;
            }
        }
        return -1;
    }



    public static void main(String[]args){
        int arr[] = {0,0,0,0};
        int N=4;
        System.out.println(transitionPoint(arr, N));
    }
}
