package level1;

public class DisplayArrayUsingRecursion {

    public  static void  fun(int[]arr, int index){

        if(index== arr.length){
            return;
        }
        System.out.print(arr[index]+ " ");
        fun(arr, index+1);
    }


    public  static void  funRev(int[]arr, int index){

        if(index== arr.length){
            return;
        }

        funRev(arr, index+1);
        System.out.print(arr[index]+ " ");
    }


    public  static  void main(String[]args){
       int[]arr={12, 10, 20, 30, 40};
//       fun(arr, 0);
        funRev(arr, 0);
    }
}
