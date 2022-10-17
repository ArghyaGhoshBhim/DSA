package level1;

import java.util.ArrayList;

public class GetMazePaths {

    public static ArrayList<String>getMazePaths(int sc, int sr, int dr, int dc){
        if(sc==dc && sr==dr){
            ArrayList<String>arrayList=new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        if(sc>dc || sr>dr){
            ArrayList<String>arrayList=new ArrayList<>();
            return  arrayList;
        }
        ArrayList<String>hPath=getMazePaths(sc+1, sr, dr, dc);
        ArrayList<String>vPath=getMazePaths(sc, sr+1, dr, dc);
        ArrayList<String>resArraylist=new ArrayList<>();
        for(String path:hPath){
            resArraylist.add("h"+path);
        }
        for(String path:vPath){
            resArraylist.add("v"+path);
        }
        return resArraylist;
    }


    public static void main(String[]args){

        getMazePaths(1, 1, 2, 3).forEach(ele->{
            System.out.println(ele);
        });
    }
}
