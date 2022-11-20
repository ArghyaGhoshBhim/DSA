package codeproblem;

import java.util.ArrayList;
import java.util.List;

public class FindingPosition {

    static long nthPosition(long n){
        // code here
        List<Long>ans=new ArrayList<>();
        for(long i=1;i<=n;i++){
            ans.add(i);
        }

        return solve(n, ans);

    }

    public static long solve(long n, List<Long>ans){
        if(ans.size()==1){
            return ans.get(0);
        }
        List<Long>list=new ArrayList<>();
        for(int i=0;i< ans.size();i++){
            if((i+1)%2==0){
                list.add(ans.get(i));
            }
        }
        System.out.println(list);

        return solve(n,list);
    }



    public static void main(String[]args){
        System.out.println(nthPosition(8));
    }

}
