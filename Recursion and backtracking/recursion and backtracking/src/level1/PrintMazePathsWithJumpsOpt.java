package level1;

public class PrintMazePathsWithJumpsOpt {

    public static void printMazePathsWithJumpsOpt(int sc, int sr, int dc, int dr, String path){

        if(sc==dc && sr==dr){
            System.out.println(path);
            return;
        }


//        for horizontal
        for(int ms=1;ms<=dc-sc;ms++){
            String h="h"+ms;
            printMazePathsWithJumpsOpt(sc+1, sr, dc, dr, path+h);
        }
//        for vertical
        for (int ms=1;ms<=dr-sr;ms++){
            String v="v"+ms;
            printMazePathsWithJumpsOpt(sc, sr+1, dc, dr, path+v);
        }

//        For diagonal
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            String d="d"+ms;
            printMazePathsWithJumpsOpt(sc+1, sr+1, dc, dr, path+d);
        }
    }



    public static void main(String[]args){
        printMazePathsWithJumpsOpt(1, 1, 3, 3, "");
    }
}
