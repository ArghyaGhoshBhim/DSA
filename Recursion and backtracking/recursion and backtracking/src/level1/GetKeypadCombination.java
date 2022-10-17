package level1;

import java.util.ArrayList;

public class GetKeypadCombination {
    static String[]codes={".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String>getKeypadCombination(String str){
        if(str.length()==0){
            ArrayList<String>firstList=new ArrayList<>();
            firstList.add("");
            return firstList;
        }
        char ch=str.charAt(0);
        String sString=str.substring(1);

        ArrayList<String>returnOfList=getKeypadCombination(sString);
        int index=Integer.parseInt(ch+"");
        char[]chArr=codes[index].toCharArray();
        ArrayList<String>list=new ArrayList<>();
        for(String strEle:returnOfList){
            for(char chEle:chArr){
                list.add(chEle+strEle+"");
            }
        }
        return list;

    }

    public static void main(String[]args){
        getKeypadCombination("739").forEach((String ele)->{
            System.out.print(ele+" ");
        });
    }
}
