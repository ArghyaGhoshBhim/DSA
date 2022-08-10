public class FindMaximum{




    public static void main(String[] args){

        FindMaximum findMaximum=new FindMaximum();
        int[] arr={1022, 22, 115, 30};
        System.out.println( findMaximum.maximum(arr, 0));

    }
    public int maximum(int arr[], int indx){

        if(indx==arr.length-1){
            return arr[indx];
        }
        int max=maximum(arr, indx+1);
        if(max<arr[indx]){
            max=arr[indx];
        }
        return max;

    }
}
