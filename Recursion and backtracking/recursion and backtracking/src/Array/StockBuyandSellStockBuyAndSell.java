package Array;

import java.util.ArrayList;

public class StockBuyandSellStockBuyAndSell {


    public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        int start=0;

        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(A[i]<=A[start]){
                start=i;
            }else{
                ArrayList<Integer>list=new ArrayList<>();
                list.add(start);
                list.add(i);
                ans.add(list);
                start=i;
            }
        }

        return ans;
    }


    public static void main(String[]args){
        int N = 7;
        int A[] = {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(A, N));
    }
}
