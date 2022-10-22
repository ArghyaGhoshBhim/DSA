package level1;

public class PrintEncodings {

    public static void printEncodings(String ques, String asf){
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }else if(ques.length()==1){
            if (ques=="0"){
                return;
            }else {

                char charAsf=(char)(Integer.parseInt(ques)+65-1) ;
                asf=asf+charAsf;
            }
        }
        char chAtFirstIndex=ques.charAt(0);
        int firstIndexNumber=Integer.parseInt(chAtFirstIndex+"");
        if(firstIndexNumber>0){
            printEncodings(ques.substring(1), asf+((char)(firstIndexNumber-1+65)));
        }
        int firstTowIndexNumber=Integer.parseInt(ques.substring(0, 2));
        if(firstTowIndexNumber<=26){
            printEncodings(ques.substring(3), asf+((char)(firstIndexNumber-1+65)));
        }
    }



    public static  void main(String[]args){

        printEncodings("123", "");
    }
}
