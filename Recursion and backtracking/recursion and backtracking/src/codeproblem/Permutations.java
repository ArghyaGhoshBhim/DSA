package codeproblem;

import java.util.ArrayList;

public class Permutations {
    public static ArrayList<String>permutations(String s){

        ArrayList<String>ans=new ArrayList<>();
        int i=0;
        fun(s, ans, i);
        return ans;

    }

    public static void fun(String s, ArrayList<String>ans, int index){
        if(index>=s.length()){
            ans.add(s);
            return;
        }

        for(int i=index;i<s.length();i++){
            s=swap(index, i, s);
            fun(s, ans, index+1);
            s=swap(index, i, s);
        }
    }


    public static String swap(int i, int j, String str){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }


    public static void main(String[]args){

        permutations("abc").forEach(e->System.out.println(e));
//        System.out.println(swap(0, 3, "arghya"));
    }
}
