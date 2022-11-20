package Array;

public class LongestCommonPrefixInAnArray {

   static String longestCommonPrefix(String arr[], int n){

        String ans="";
//        Take the first elemet in the array
        for(int i=0;i<arr[0].length();i++){
            String str=arr[0].charAt(i)+"";
//            System.out.println(str);
            boolean flag=true;
            for(int j=1;j<n;j++){

                if( arr[j].length()-1<i || !str.equals(arr[j].charAt(i)+"")){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                ans=ans.concat(str);
            }
        }
        if(ans=="" || ans.length()==1){
            return "-1";
        }
        return ans;
    }

    public static void main(String[]args){

//       String arr[] = {"geeksforgeeks", "geeks", "geek",
//                "geezer"};
       String arr[]={ "hello", "world"};
        System.out.println(longestCommonPrefix(arr, arr.length));
    }
}
