public class quicksort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
for(int j=low;j<high;j++){
    if(arr[j]<pivot){
        i++;
        //swap
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}   
//swap with pivot
i++;
int temp=arr[i];
arr[i]=arr[high];
arr[high]=temp;
return i;
}
    public static void quicksorting(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksorting(arr,low,pi-1);
            quicksorting(arr,pi+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quicksorting(arr,0,n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
