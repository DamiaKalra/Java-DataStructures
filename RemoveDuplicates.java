import java.util.*;
public class RemoveDuplicates {
    public static void removedup(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removedup(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removedup(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String args[]){
        String str="apnnacollege";
        removedup(str,0,new StringBuilder(""),new boolean[26]);
    }
}
 