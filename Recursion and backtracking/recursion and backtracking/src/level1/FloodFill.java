package level1;

public class FloodFill {


    public static void floodFill(int[][]maze, int row, int col,String psf, boolean visited[][]){
        if(row<0 || col<0 || maze.length==row || maze[0].length==col ||maze[row][col]==1|| visited[row][col]==true){
            return;
        }
        if(col==maze[0].length-1 && row==maze.length-1){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        floodFill(maze, row-1, col,psf+"t", visited );
        floodFill(maze, row+1, col, psf+"d", visited);
        floodFill(maze, row, col-1, psf+"l", visited);
        floodFill(maze, row, col+1, psf+"r", visited);
        visited[row][col]=false;

    }





    public static  void main(String[]args){
        int[][]arr={{0, 1, 0, 0, 0, 0, 0},{0, 1, 0, 1, 1, 1, 0},{0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 0, 1, 1}, {1, 0, 1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0}
        };

        boolean[][] visited=new boolean[arr.length][arr[0].length];

        floodFill(arr, 0, 0, "", visited);

    }
}
