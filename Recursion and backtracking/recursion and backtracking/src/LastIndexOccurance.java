public class LastIndexOccurance {




    public static void main(String[] args){
        LastIndexOccurance lastIndexOccurance=new LastIndexOccurance();
        int[] arr={10, 47, 10, 47, 10, 12, 13};
        System.out.println(lastIndexOccurance.lastOccurance(arr, 0, 10));


    }

    public int lastOccurance(int arr[], int index, int num){


        if(index==arr.length){
            return -1;
        }

           int lastIndex=lastOccurance(arr, index+1, num);
        if(lastIndex==-1){
            if(arr[index]==num){
                return index;
            }else {
                return -1;
            }
        }else {
            return lastIndex;
        }

    }
}
