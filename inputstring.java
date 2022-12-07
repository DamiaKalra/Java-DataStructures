import java.util.*;
public class inputstring {
    //print all letters of a string
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");;
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
    String str="abcd";
    String str2= new String("xyz");
    //strings are immutable cant be changed
    Scanner sc=new Scanner(System.in);
    String name;
    name=sc.nextLine();
    System.out.println(name);
    //string length
    System.out.println(name.length());
    //cocarenation
    String firstname="Karan";
    String lastname="Kaushal";
    String fullname=firstname+" "+lastname;
    System.out.println(fullname);
    // System.out.println(fullname.charAt(8));
    printletters(fullname);
    }
}
