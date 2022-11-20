package Array;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {
    static  public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Long>map=new HashMap<>();
        String flag="Yes";
        for(int i=0;i<a1.length;i++){
            if(map.containsKey(a1[i])){
                map.replace(a1[i], map.get(a1[i])+1);
                continue;
            }
            map.put(a1[i], 1L);
        }
        System.out.println(map);

        for(int i=0;i<a2.length;i++){
            if(map.containsKey(a2[i]) && map.get(a2[i])!=0){
                map.replace(a2[i], map.get(a2[i])-1);
                continue;
            }else {
                return "No";
            }
        }

        return flag;
    }

    public static void main(String[]args){
        long a1[] = {1, 2, 3, 4, 5, 1, 1, 1};
        long a2[] = {1, 2, 3, 1};
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }
}
