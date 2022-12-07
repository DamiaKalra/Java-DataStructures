import java.util.*;
public class checkprime {
    public static boolean isprime(int n){
        //corner cases
        if(n==2){
            return true;
        }
    boolean isprime=true;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isprime=false;
            break;
        }
    }
    return isprime;
}

//primes in range
public static void primesinrange(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}
public static void main(String args[]){
    System.out.println(isprime(2  ));
    primesinrange(200);
}}
