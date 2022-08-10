public class PrintdecreasingIncreasing {

    public static void main(String[] args){
        PrintdecreasingIncreasing printdecreasingIncreasing=new PrintdecreasingIncreasing();
//        printdecreasingIncreasing.printDecreasing(5);
//        printdecreasingIncreasing.printIncreasing(5);

        printdecreasingIncreasing.pdi(5);
    }


    public void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
