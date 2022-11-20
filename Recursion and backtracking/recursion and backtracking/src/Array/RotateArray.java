package Array;

public class RotateArray {
    public static void rotate(int[]arr, int n, int k){

//        int last=0;
//        for (int i=0;i<k;i++){
//            last=arr[n-1];
//            for(int j=n-1;j>0;j--){
//                arr[j]=arr[j-1];
//            }
//            arr[0]=last;
//        }

//        int[]ans=new int[n];
//        for(int i=0;i<n;i++){
//            int index=(k+i)%n;
//            ans[index]=arr[i];
//        }
//
//        for(int j=0;j<n;j++){
//            arr[j]=ans[j];
//        }


        solve(arr, 0, n-1-k);
        solve(arr, n-k, n-1);
        solve(arr, 0, n-1);
    }


    public static void solve(int[]arr, int s, int e){


        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args){
        int[]arr={1, 2, 3, 4, 5};
        int n=5;

        System.out.println(13/2);
        rotate(arr, n, 2);
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
