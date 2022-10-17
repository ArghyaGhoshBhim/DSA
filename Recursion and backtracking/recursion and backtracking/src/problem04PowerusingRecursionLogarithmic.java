public class problem04PowerusingRecursionLogarithmic {

    static int recursionLogarithmic(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnb2=recursionLogarithmic(x, n/2);
        int nb2=xpnb2*xpnb2;
        if(n%2==1){
            nb2=nb2*x;
        }
        return  nb2;
    }
    public static void main(String[]args){
        System.out.println(recursionLogarithmic(25, 2));

    }
}
