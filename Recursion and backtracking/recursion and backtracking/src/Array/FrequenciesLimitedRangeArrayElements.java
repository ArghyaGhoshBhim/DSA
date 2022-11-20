package Array;

import java.util.HashMap;

public class FrequenciesLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int ans[]=new int[N];
        for (int i=0;i<N;i++){
            if(arr.length>=arr[i])
            ans[arr[i]-1]+=1;
        }


        int k=0;
        for(int i=0;i<N;i++){
            arr[k]=ans[i];
            k++;
        }
        return;
    }



    public static void main(String[]args){

       int N = 5;
        int arr[] = {2, 3, 2, 3, 5};
        int P = 5;
        frequencyCount(arr, N, P);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}

//
//    For Input:
//        5
//        2 4 5 6 8
//        10
//        Your Output:
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
//        at Solution.frequencyCount(File.java:49)
//        at GFG.main(File.java:26)
//
//        Its Correct output is:
//        0 1 0 1 1