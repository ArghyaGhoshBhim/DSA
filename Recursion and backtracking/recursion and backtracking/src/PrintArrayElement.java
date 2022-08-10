public class PrintArrayElement {




    public static void main(String[] args){

        PrintArrayElement printArrayElement=new PrintArrayElement();
        int[] arr={10, 20, 30, 40};
        printArrayElement.display(arr, 0);

    }

    public void display(int arr[], int idx){

        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx+1);

    }
}
