public class FactorialOfNumber {



    public static void main(String[] args){
        FactorialOfNumber factorialOfNumber=new FactorialOfNumber();
        int n=factorialOfNumber.factorial(1);
        System.out.println(n);
    }
    public int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
