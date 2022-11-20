package codeproblem;

public class SortArrayOf0s1sAnd2s {

    public static void sort012(int a[], int n)
    {
        // code here
        int[]arr=new int[3];
        for(int i=0;i<n;i++){
           arr[a[i]]+=1;
        }
        for(int i=0;i<n;i++){
            if(arr[0]!=0){
                a[i]=0;
                continue;
            }
            if(arr[1]!=0){
                a[i]=1;
                continue;
            }
            if(arr[2]!=0){
                a[i]=2;
                continue;
            }
        }
    }
}
