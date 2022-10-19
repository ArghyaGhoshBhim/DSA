package level1;

public class PrintMazePathsOpt {


    public static void printMazePathsOpt(int sc, int sr, int dc, int dr, String path){
        if(sc==dc && sr==dr){
            System.out.println(path);
            return;
        }
        if(sc>dc||sr>dr){
            return;
        }

        printMazePathsOpt(sc+1, sr, dc, dr, path+"h");
        printMazePathsOpt(sc, sr+1, dc, dr, path+"v");
    }








    public static  void main(String[]args){
        printMazePathsOpt(1, 1, 3, 3, "");
    }
}
