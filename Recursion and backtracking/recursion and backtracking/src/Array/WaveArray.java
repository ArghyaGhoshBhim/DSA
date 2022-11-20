package Array;

public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n;i+=2){
            if(i!=n-1 & i<n){
                swap(a, i, i+1);
            }else {
                break;
            }

        }
    }

    public static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[]args){
        int[]arr= {2,4,7,8,9,10};
        convertToWave(arr.length,arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
