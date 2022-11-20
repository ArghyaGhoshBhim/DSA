package Array;

import java.util.TreeSet;

public class RemoveDuplicateElementsFromSortedArray {

//    static int remove_duplicate(int A[],int N){
//        // code here
//        TreeSet<Integer>set=new TreeSet<>();
//        for(int i=0;i<N;i++){
//            set.add(A[i]);
//        }
//        A=new int[set.size()];
//        int index=0;
//        for(int e:set){
//            A[index]=e;
//            index++;
//            System.out.println(e);
//        }
//        return A.length;
//    }

    static int remove_duplicate(int A[],int N){
        int cnt=0;
        int ele=-999999999;
        for(int i=0;i<N;i++){
            if(A[i]>ele){
                cnt++;
                ele=A[i];
            }
        }
        return cnt;
    }



    public static void main(String[]args){
        int N = 42;
        int []array = {1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
        System.out.println(remove_duplicate(array, N));
    }
}
