package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class IntersectionOfTwoArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashMap<Integer, Integer>map=new LinkedHashMap<>();
        int cnt=0;

        for(int i=0;i<n;i++){
            if(map.containsKey(a[i]))
            map.put(a[i], map.get(a[i])+1);
            else map.put(a[i],1);
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(b[i]) &&  map.get(b[i])>0){
                cnt++;
                map.replace(b[i], map.get(b[i])-1);
                map.remove(b[i]);
            }
        }
        return cnt;
    }






    public static void main(String[]args){
       int  n = 6, m = 5;
       int  a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {3, 4, 5, 6, 7} ;
        System.out.println(NumberofElementsInIntersection(a, b, n, m));
    }
}
