package level1;

public class PrintKeypadCombination {
    static String[]codes={".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombination(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char firstIndex=str.charAt(0);
        String restOfStr=str.substring(1);
        int index=Integer.parseInt(firstIndex+"");
        String indexStr=codes[index];
        char[] charArr=indexStr.toCharArray();
        for(char ch:charArr){
            printKeypadCombination(restOfStr, ans+ch);
        }

    }

    public static void main(String[]args){

        printKeypadCombination("678", "");
    }
}
