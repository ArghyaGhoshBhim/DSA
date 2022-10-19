package level1;

public class PrintStairPathsOpt {

    public static  void printStairPathsOpt(int n, String path){
        if(n==0){
            System.out.println(path);
            return;
        }
        if(n<0){
            return;
        }
        printStairPathsOpt(n-1, path+1);
        printStairPathsOpt(n-2, path+2);
        printStairPathsOpt(n-3, path+3);

    }



    public static  void main(String[]args){

        printStairPathsOpt(3, "");
    }
}
