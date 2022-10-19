package level1;

import java.util.ArrayList;

public class GetMazePathswithJump {


    public static ArrayList<String>getMazePathWithJump(int sc, int sr, int dc, int dr){

        if(sc==dc && sr==dr ){
            ArrayList<String >list=new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String>result=new ArrayList<>();

//        for horizontal
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String>hPath=getMazePathWithJump(sc+ms, sr, dc, dr);
            for(String path:hPath){
                result.add("h"+ms+path);
            }
        }
        //        for vertical
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String>vPath=getMazePathWithJump(sc, sr+ms, dc, dr);
            for(String path:vPath){
                result.add("v"+ms+path);
            }
        }
        //        for diagonal
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String>dPath=getMazePathWithJump(sc+ms, sr+ms, dc, dr);
            for(String path:dPath){
                result.add("d"+ms+path);
            }
        }


        return result;

    }


    public static void main(String[]args){

        getMazePathWithJump(1, 1, 3, 3).forEach(ele->{
            System.out.println(ele);
        });
    }
}
