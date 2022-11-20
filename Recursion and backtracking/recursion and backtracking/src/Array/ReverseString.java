package Array;

public class ReverseString {
    public static String fun(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            swap(charArray, start, end);
            end--;
            start++;
        }
        return null;
    }
    public static void swap(char[]arr, int start, int end){
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static  void main(String[]args){
        System.out.println(fun("arghya"));
    }
}
