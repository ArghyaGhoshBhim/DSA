public class TowerOfHanoi {



    public static void main(String[] args){

        TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
        char tw1='a';
        char tw2='b';
        char tw3='c';
        towerOfHanoi.twh(3, tw1, tw2, tw3);
    }


    public void twh(int n, char A, char B, char C){

        if(n==0){
            return;
        }
        twh(n-1, A, C, B);
        System.out.println(n+" "+A+" -> "+B);
        twh(n-1, C, B, A);

    }
}
