package level1;

import java.sql.Array;

public class AllIndicesInArray {


    public static int[]allIndices(int[]arr, int x, int indx, int fsf){
        if(indx== arr.length){
            return new int[fsf];
        }

        if(arr[indx]==x){
            int[]res=allIndices(arr, x, indx+1, fsf+1);
            res[fsf]=indx;
            fsf-=1;
            return res;
        }else {
            int[]res=allIndices(arr, x, indx+1, fsf);
            return res;
        }
    }



    public static void main(String[]args){
        int[]arr={2, 3, 4, 2, 3, 5, 2, 8, 5};

        for (int ele:
                allIndices(arr, 5, 0, 0)) {
            System.out.print(ele+" ");

        }
    }
}
