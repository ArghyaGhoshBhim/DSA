package codeproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class CombinationSum {



    public static void combSum1(ArrayList<Integer>arr, int b, ArrayList<Integer>ans){
       if(b==0){
           System.out.println(ans);
           return;
       }
       if(b<0){
           return;
       }
        for (int i=0;i< arr.size();i++){
            ans.add(arr.get(i));
            Collections.sort(ans);
            combSum1(arr, b-arr.get(i),ans );
            ans.remove(arr.get(i));
        }

    }





    public static ArrayList<ArrayList<Integer>>combSum(ArrayList<Integer>ques, int b){
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();

        Set<Integer>set=new HashSet<>(ques);
        ques.clear();
        ques.addAll(set);
        Collections.sort(ques);

        findNum(ques, ans, b, temp);
//        Set<ArrayList<Integer>>ansSet=new HashSet<>(ans);
//        ans.clear();
//        ans.addAll(ansSet);

        return ans;

    }



    public static void findNum(ArrayList<Integer>ques, ArrayList<ArrayList<Integer>>ans, int b, ArrayList<Integer>temp){

        if(b==0){

            if(ans.contains(temp)){

            }else {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(b<0){
            return;
        }

        for(int i=0;i<ques.size();i++){

            temp.add(ques.get(i));
            Collections.sort(temp);
            findNum(ques, ans, b-ques.get(i), temp);
            temp.remove(ques.get(i));
        }

    }





    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer>ans=new ArrayList<>();
//        combSum1(list, 5, ans);

        ArrayList<ArrayList<Integer>>ansList=combSum(list, 5);
        ansList.forEach(e->System.out.println(e));

    }


}
