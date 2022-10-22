package level1;

public class PrintPermutations {

    public static void printPermutations(String ques, String asf){
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<ques.length();i++){
            String strBeforeI=ques.substring(0, i);
            String strAfterI=ques.substring(i+1);
            String quesWithOutI=strBeforeI+strAfterI;
            printPermutations(quesWithOutI, asf+ques.charAt(i));
        }
    }




    public static  void main(String[]args){

        printPermutations("abc", "");
    }
}
