import java.util.*;
public class subarray {
    public static void printsubarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            //yha pe humne j wale element ko j=1 se start kra taki hum 
            //single wale element ko bhi sath me print krwa de
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" ");;
                }
                ts++;
                System.err.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays : "+ts); 
    }
        public static void main(String args[]){
            int numbers[]={2,4,6,8,10};
            printsubarray(numbers);
        }}
 