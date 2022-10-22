package level1;

public class TargetSumSubsets {
    public static void targetSumSubsets(int[]arr, int idx, String set, int sos, int tar){
        if(idx== arr.length){
            if(sos==tar){
                System.out.println(set);
            }
            return;
        }



        targetSumSubsets(arr, idx+1, set+arr[idx]+",", sos+arr[idx], tar);
        targetSumSubsets(arr, idx+1, set, sos, tar);
    }



    public static void main(String[]args){
        int[]arr={10, 20, 30, 40};
        targetSumSubsets(arr, 0, "", 0, 70);
    }
}
