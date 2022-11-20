package Array;


import java.util.*;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class FindAllPairsWithGivenSum {

//    public static pair[] allPairs( long A[], long B[], long N, long M, long X) {
//        // Your code goes here
//        List<Long>list=new ArrayList<>();
//        List<pair>pairList=new ArrayList<>();
//        for (int i=0;i<M;i++){
//            list.add(B[i]);
//        }
//        for(int j=0;j<N;j++){
//            long ele=X-A[j];
//            if(list.contains(ele)){
//                pair p=new pair(A[j], ele);
//                pairList.add(p);
//                list.remove(ele);
//            }
//        }
//
//
//        pair[]ans=new pair[pairList.size()];
//
//        int indx=0;
//        for(pair ele:pairList){
//            ans[indx]=ele;
//            indx++;
//        }
//        return ans;
//    }


//    public static pair[] allPairs( long A[], long B[], long N, long M, long X) {
//        // Your code goes here
//        HashMap<Long, Long>map=new HashMap<>();
//        List<pair>pairList=new ArrayList<>();
//        List<Long>aList=new ArrayList<>();
//        for(int i=0;i<N;i++){
//            aList.add(A[i]);
//        }
//        Collections.sort(aList);
//        for(int i=0;i<M;i++){
//            if(map.get(B[i])!=null){
//               map.put(B[i], map.get(B[i])+1);
//               continue;
//            }
//            map.put(B[i], 1L);
//        }
////        System.out.println(map);
//
//        for(int i=0;i<N;i++){
//            long need=X-A[i];
//            if(map.get(need)!=null)
//            for (int j=0;j<map.get(need);j++){
//                pair p=new pair(aList.get(i), need);
//                pairList.add(p);
//            }
//        }
////        System.out.println(pairList);
//
//        pair[]ans=new pair[pairList.size()];
//
//        for (int i=0;i< ans.length;i++){
//            ans[i]=pairList.get(i);
//
//        }
//
//        return ans;
//    }



    public static pair[] allPairs( long A[], long B[], long N, long M, long X){

        HashSet<Long>set=new HashSet<>();
        ArrayList<pair>arrayList=new ArrayList<>();
        Arrays.sort(A);
        for(int i=0;i<M;i++){
            set.add(B[i]);
        }
        for(int i=0;i<N;i++){
            if(set.contains(X-A[i])){
                arrayList.add(new pair(A[i], X-A[i]));
            }
        }

        pair[]ans=new pair[arrayList.size()];
        for(int i=0;i< ans.length;i++){
            ans[i]=arrayList.get(i);
        }
        return ans;
    }


    public static void main(String[]args){
        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8} ;
       int X =9 ;

       pair[]ans=allPairs(A, B, A.length, B.length, X);
       for(pair e:ans){
           System.out.println(e.first+" "+e.second);

       }

    }
}
