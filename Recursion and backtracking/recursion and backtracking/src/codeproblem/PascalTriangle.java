package codeproblem;

import java.util.ArrayList;

public class PascalTriangle {

    public static ArrayList<Integer>solve(int n){

        if(n==1){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(1);
            return list;
        }
        if(n==2){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(1);
            list.add(1);
            return list;
        }
        ArrayList<Integer>rList=solve(n-1);
        ArrayList<Integer>newList=new ArrayList<>();
        newList.add(1);
        for(int i=0;i<n-2;i++){
            newList.add(rList.get(i)+rList.get(i+1));
        }
        newList.add(1);
        return newList;
    }




    public static void main(String[]args){
        System.out.println(solve(4));
    }
}
