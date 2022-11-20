package level2;

public class PrintLexicographicalOrderUsingRecursion {

    public static void printLexicographicalOrderUsingRecursion(int n){
        for(int i=1;i<10;i++){
            solve(i, n);
        }

    }
    public static void solve(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<10;j++){
            solve(10*i+j, n);
        }

    }

    public static void main(String[]args){
        printLexicographicalOrderUsingRecursion(30);
    }
}
