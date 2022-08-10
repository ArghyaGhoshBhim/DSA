public class ReverseArrayPrint {




    public static void main(String[] args){

        ReverseArrayPrint reverseArrayPrint=new ReverseArrayPrint();
        int[] arr={10, 20, 30, 40};
        reverseArrayPrint.reverseArrayPrint(arr, 0);

    }
    public void reverseArrayPrint(int arr[], int indx){
        if(indx==arr.length){
            return;
        }
        reverseArrayPrint(arr, indx+1);
        System.out.println(arr[indx]);
    }
}
