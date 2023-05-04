public class FriendsPairing {
    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendspairing(n-1);
        //pair
        int fnm2=friendspairing(n-2);
        int pairWays=(n-1)*fnm2;
        //totways
        int totways=fnm1+pairWays;
        return totways;

        //return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));
    }
}
