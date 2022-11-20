package Array;

import java.util.Arrays;

public class Rotation {

    static int findKRotation(int arr[], int n) {
        // code here
        int min=99999999;
        int index=0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }



    public static void main(String[]args){
       int N = 5;
        int Arr[] = {3, 4, 5, 1, 2};
        System.out.println(findKRotation(Arr,N));
    }
}
