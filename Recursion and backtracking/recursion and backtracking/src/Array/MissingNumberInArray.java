package Array;

import java.util.ArrayList;

public class MissingNumberInArray {

    static int MissingNumber(int array[], int n) {
        // Your Code Here
        boolean[]flag=new boolean[n];
        for(int i=0;i<array.length;i++){
            flag[array[i]-1]=true;
        }
        for(int i=0;i<n;i++){
            if (flag[i]==false){
                return i+1;
            }
        }
        return -1;
    }



    public static void main(String[]args){
//        System.out.println(MissingNumber({1,2,3,5}));
//        ArrayList<Boolean>flag=new ArrayList<>(0);

//        for(int i=0;i<flag.length;i++){
//            System.out.println(flag[i]);
//        }
    }


}
