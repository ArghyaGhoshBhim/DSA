package level1;

public class FirstIndexOfOccurrenceInArrayUsingRecursion {

    public static int  firstIndexOfOccurrence(int[]arr, int index, int d){
        if(arr.length==index){
            return -1;
        }

        if(arr[index]==d){
            return index;
        }else{
            return firstIndexOfOccurrence(arr, index+1, d);
        }
    }






    public static  void main(String[]args){
        int[]arr={10, 20, 15, 20, 23, 22, 10, 18};
        System.out.println(firstIndexOfOccurrence(arr, 0, 10));
    }
}
