package codeproblem;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {

    static List<Integer> pattern(int N){
        // code here
        List<Integer>ans=new ArrayList<>();
        solve(N, ans);
        return ans;

    }
    public static void solve(int N, List<Integer>ans){

        if(N<=0){
            ans.add(N);
            return;
        }
        ans.add(N);
        N=N-5;
        solve(N, ans);
        N=N+5;
        ans.add(N);
    }

    public static void main(String[]args){
        System.out.println(pattern(10));
    }
}
