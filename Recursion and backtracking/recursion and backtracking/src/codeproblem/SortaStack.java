package codeproblem;

import java.util.Collections;
import java.util.Stack;

public class SortaStack {

    public static Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer>ans=new Stack<>();
        solve(s, ans);
        return ans;
    }

    public static void solve(Stack<Integer>s, Stack<Integer>ans){
        if(s.isEmpty()){
            return;
        }
        int peek=s.pop();
        sortSolve(ans, peek);
        solve(s, ans);
    }


    public static void sortSolve(Stack<Integer>ans, int peek){
        if(ans.isEmpty()||peek>ans.peek()){
         ans.push(peek);
         return;
        }
        int top=ans.pop();
        sortSolve(ans, peek);
        ans.push(top);
    }

    public static void main(String[]args){
        Stack<Integer>s=new Stack<>();
        s.add(41);
        s.add(3);
        s.add(32);
        s.add(2);
        s.add(11);
        System.out.println("s"+ s);
        sort(s).forEach(e-> System.out.println(e));
    }
}
