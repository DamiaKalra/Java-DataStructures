import java.util.*;
public class printdec {
    public static void printrec(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printrec(n-1);
}
public static void main(String args[]){
    int n=10;
    printrec(n);
}
}
