package level2;

public class PrintAbbreviations {


    public static void printAbbreviations(String ques, String  ans, int count){

        if(ques.length()==0){
            if(count==0){
                System.out.println(ans);
            }else {
                System.out.println(ans+count);
            }

            return;
        }

        char ele=ques.charAt(0);
       if(count>0){
           printAbbreviations(ques.substring(1), ans+count+ele, 0);
       }else {
           printAbbreviations(ques.substring(1), ans+ele, count);
       }
        printAbbreviations(ques.substring(1), ans, count+1);

    }





    public static  void main(String[]args){

        printAbbreviations("pep", "", 0);
    }
}
