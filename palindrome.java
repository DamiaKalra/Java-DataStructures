public class palindrome {
        //print all letters of a string
        public static void printletters(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i)+" ");;
            }
            System.out.println();
        }
        public static boolean ispalindrome(String str){
            for(int i=0;i<str.length()/2;i++){
                int n=str.length();
                if(str.charAt(i)!=str.charAt(n-i-1)){
                    //not a palindrome
                    return false;
                }
            }
            return true;
        }
        public static void main(String args[]){
            String str="racecar";
            System.out.println(ispalindrome(str));;

            }}
