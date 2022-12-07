import java.util.*;
public class stringcompression {
    public static String compress(String str){
        String newStr="";
        // loop is running till the length of the string so O(n)
        for(int i=0;i<str.length();i++){  //O(n)
            //integer to string me convert krna pdega
            //tostring func use krk thts why Integer is used
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            //adding letter
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str="aaabbccdd";
        System.out.println(compress(str));
    }
}
