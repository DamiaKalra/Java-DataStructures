import java.util.*;
public class trappingrainwater {
    public static int trappedrainwater(int height[]){
        //calculate left max boundary-array
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
                    //waterlevel=min(leftmax bound,rightmaxbound)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
                    //trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(trappedrainwater(height));
}
}
