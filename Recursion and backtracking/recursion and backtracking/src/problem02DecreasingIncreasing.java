public class problem02DecreasingIncreasing {

    static void decreasingIncreasing(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        decreasingIncreasing(n-1);

    }


    public static  void main(String[] args){

        decreasingIncreasing(5);

    }
}
