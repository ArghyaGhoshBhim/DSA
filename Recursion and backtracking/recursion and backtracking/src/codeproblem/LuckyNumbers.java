package codeproblem;

import java.util.ArrayList;

public class LuckyNumbers {


//    public static boolean lNum(int n){
//
//        ArrayList<Integer>list=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            list.add(i+1);
//        }
//        System.out.println(list);
//        solve(n, list, 2);
//      if (list.contains(n)){
//          return true;
//      }{
//          return false;
//        }
//    }
//    public static void solve(int n, ArrayList<Integer>list, int step){
//        if(step>list.size()|| !list.contains(n)){
//            return;
//        }
//
//
//     int i=step-1;
//        while (i< list.size()){
//            list.remove(i);
//            i+=step-1;
//        }
//        System.out.println(list);
////        for(int ele=0;ele<list.size();ele+=step-1){
////            if(list.get(ele)==0){
////                list.remove(ele);
////            }
////        }
//        solve(n, list, step+1);
//
//    }
//

    public static boolean lNum(int n){
        boolean ans=solve(n, 2);
        return ans;
    }

    public static boolean solve(int n, int step){
        if(step>n){
            return true;
        }
        if(n%step==0){
            return false;
        }

        return solve(n-n/step, step+1);
    }

    public static void main(String[]args){
        System.out.println(lNum(73));
    }
}
