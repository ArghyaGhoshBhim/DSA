package level1;

public class MaximumOfAnArray {


    public static int maxInArray(int[]arr, int index){

        if(arr.length-1==index){
            return arr[index];
        }

        int max=maxInArray(arr, index+1);
        if(arr[index]>max){
            return arr[index];
        }
        return max;
    }




    public static  void main(String[]args){
        int[]arr={11, 21, 5, 25, 30, 12, 33};
        int max=maxInArray(arr, 0);
        System.out.println(max);
    }
}
