package level1;

public class PrintSubsequenceOpt {

    public static void printSubsequenceOpt(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char charAtZero=ques.charAt(0);
        String subStr=ques.substring(1);
//        When first char will come with the ans
        printSubsequenceOpt(subStr, ans+charAtZero);
        //        When first char will not come with the ans
        printSubsequenceOpt(subStr, ans+"");
    }


    public static void main(String[]args){
        printSubsequenceOpt("abc", "");
    }
}
