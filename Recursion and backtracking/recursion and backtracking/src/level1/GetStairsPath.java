package level1;

import java.util.ArrayList;

public class GetStairsPath {

    public static ArrayList<String>getStairsPath(int n){

        if(n==0){
            ArrayList<String>list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(n<0){
            ArrayList<String>list=new ArrayList<>();
            return list;
        }
        ArrayList<String>path1=getStairsPath(n-1);
        ArrayList<String>path2=getStairsPath(n-2);
        ArrayList<String>path3=getStairsPath(n-3);
        ArrayList<String>resultList=new ArrayList<>();

        for (String ele:path1){
            resultList.add(1+ele);
        }
        for (String ele:path2){
            resultList.add(2+ele);
        }
        for (String ele:path3){
            resultList.add(3+ele);
        }
        return resultList;

    }


    public static  void main(String[]args){

        System.out.print(getStairsPath(4));
    }
}
