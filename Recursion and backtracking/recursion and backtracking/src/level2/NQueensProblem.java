package level2;

public class NQueensProblem {

    public static  void queensProblem(boolean[][]bord, int row, boolean[]cols,  boolean[]ndiags, boolean[]rdiags, String ansf){
        if(row==bord.length){
            System.out.println(ansf+" ");
            return;
        }

        for(int col=0;col<bord.length;col++){
            if(cols[col]==false && ndiags[row+col]==false && rdiags[row-col+bord.length-1]==false){
                bord[row][col]=true;
                cols[col]=true;
                ndiags[row+col]=true;
                rdiags[row-col+bord.length-1]=true;
                queensProblem(bord, row+1, cols, ndiags, rdiags, ansf+row+"-"+col+",");
                bord[row][col]=false;
                cols[col]=false;
                ndiags[row+col]=false;
                rdiags[row-col+bord.length-1]=false;
            }

        }
    }



    public static void main(String[]args){
        int n=4;
        boolean[][]bord=new boolean[n][n];
        boolean[]cols=new boolean[n];
        boolean[]ndiag=new boolean[2*n-1];
        boolean[]rdiag=new boolean[2*n-1];
        queensProblem(bord, 0, cols, ndiag, rdiag, "");
    }
}
