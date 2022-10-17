package level1;

import java.util.ArrayList;
import java.util.Collections;

public class GetSubsequence {
    public static ArrayList<String>getSubsequence(String str){

        if(str.length()==0){
            ArrayList<String>list=new ArrayList<>();
            list.add("");
            return list;
        }
        char ch=str.charAt(0);
        String subString= str.substring(1);
        ArrayList<String>rros=getSubsequence(subString);

        ArrayList<String>res=new ArrayList<>();
        for(String ele:rros){
            res.add(""+ele);
        }
        for(String ele:rros){
            res.add(ch+ele);
        }

        return res;
    }

    public static void main(String[]args){

        getSubsequence("abc").forEach((String ele)->{
            System.out.print(ele+ " ");
        });
    }
}
