public class FirstIndexOccurrence {





    public static void main(String[]args){
        FirstIndexOccurrence firstIndexOccurrence=new FirstIndexOccurrence();
        int[] arr={10, 47, 10, 47, 10, 12, 13};
        System.out.println(firstIndexOccurrence.firstOccurrence(arr, 0, 13));

    }

    public int firstOccurrence(int arr[],int ind, int num){

        if(arr.length==ind){
            return -1;
        }
        if(arr[ind]==num){
            return ind;
        }else {
            int firstIndx=firstOccurrence(arr, ind+1, num);
            return firstIndx;
        }


//        if(arr[ind]==num){
//            firstIndx=ind;
//        }
//        return firstIndx;

    }
}
