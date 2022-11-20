package level2;

import java.util.ArrayList;

public class GameOfExecutionJosephus {
    public static int gameOfExecutionJosephus(int n, int k){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
        soluttion(list, k, 0);
        return list.get(0);
    }

    public static void soluttion(ArrayList<Integer>arr,int k, int index){
        if(arr.size()==1){
            return;
        }

        index=(index+k-1)%arr.size();
        arr.remove(index);
        soluttion(arr, k, index);
    }




    public static  void main(String[]args){
        System.out.println(gameOfExecutionJosephus(3, 2));
    }
}
