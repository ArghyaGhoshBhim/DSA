package level1;

public class TowerOfHanoi {
    /**
     * A----------->source(S)
     * B----------->Destination(D)
     * C----------->help to reach sorurce to destination(H)
     */
    public  static void  fun(int n, char A, char B, char C){

        if(n==0){
            return;
        }
        /**
         * A--->S
         * C--->D
         * B--->H
         */
        fun(n-1, A, C, B);
        System.out.println(n+"["+A+"-->"+B+"]");

        /**
         * C---->S
         * B---->D
         * A----->H
         */
        fun(n-1, C, B, A);
    }

    public  static  void main(String[]args){
        fun(3, 'A', 'B', 'C');
    }
}
