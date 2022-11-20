package Array;

import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegativeNumbers {
    static void rearrange(int arr[], int n) {
        // code here
        List<Integer> pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        System.out.println(pos);
        System.out.println(neg);
        int i=0;
        int pi=0;
        int ni=0;
        while(pi<pos.size() && ni<neg.size()){
            if(i%2==0){
                arr[i]=pos.get(pi);
                pi++;
            }
            else{
                arr[i]=neg.get(ni);
                ni++  ;
            }

            i++;
        }

        if(pi< pos.size()){
            while(i<arr.length){
                arr[i]=pos.get(pi);
                i++;
                pi++;
            }
        }
        if(ni< neg.size()){
            while (i< arr.length){
                arr[i]=neg.get(ni);
                i++;
                ni++;
            }
        }


    }

    public static void main(String[]args){
       int N = 10;
       int Arr[] = {-5 ,-2 ,5, 2, 4 ,7 ,1 ,8, 0, -8};
//        int Arr[] = {-40, 90, -65, 19};
        rearrange(Arr, Arr.length);
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}
