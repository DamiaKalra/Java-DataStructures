import java.util.*;
public class maxareahistogram {
    public static void maxarea(int arr[]){ //O(n)-optimized
        int maxarea=0;
        int nsr[]=new int[arr.length];
         int nsl[]=new int[arr.length];
        //Next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i]=arr.length;
            }
            else{
                //top
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next smaller left
      s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsl[i]=arr.length;
            }
            else{
                //top
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Current area : width =j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currarea=height*width;
            maxarea=Math.max(currarea,maxarea);
        }
        System.out.println("max area in histogram = "+maxarea);
    }
public static void main(String args[]){
    int arr[]={2,1,5,6,2,3};//height in histogram
    maxarea(arr);
}
}
