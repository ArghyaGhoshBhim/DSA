package codeproblem;

import java.util.ArrayList;

public class Tho {
    public static long toh(int N, int from, int to, int aux) {
        // Your code here
//        long ans=0;
        ArrayList<Long>ans=new ArrayList<>();
        ans.add(0L);
        from=1;

        to=2;
        aux=3;
        solve(N, from, to, aux, ans);
        return ans.get(0);
    }

    public static void solve(int N, int from, int to, int aux, ArrayList<Long>ans){

        if(N==0){
            return;
        }

        solve(N-1, from, aux, to, ans);
        System.out.println("move disk "+N+" from rod "+ from+" to rod "+to);
      ans.set(0, ans.get(0)+1);
        solve(N-1, aux, to, from, ans);
    }

    public static void main(String[]args){
        System.out.println(toh(2, 1, 2, 3));
    }
}
