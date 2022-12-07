public class inserionsort {
    public static void insertionsorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i]; //stores element in temporary variable
            int prev=i-1;
            //finding out the correct position to insert
            //arr[prev]<curr in descending order 
           while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
           }
           //insertion
           arr[prev+1]= curr;
        }
    }
                public static void printarr(int arr[]){
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");;
                    }
                    System.out.println();
                }
                public static void main(String args[]){
                    int arr[]={5,4,1,3,2};
                    insertionsorting(arr);
                    printarr(arr);
                } 
}