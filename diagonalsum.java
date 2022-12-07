import java.util.*;
public class diagonalsum {
    public static int diagsum(int matrix[][]){
        int sum=0;
        //o(n^2) time complexity is more so this is not a optimized approach
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];                }
        //     }
        //     int j=0;
        //     else if(i+j ==matrix.length-1){
        //         sum+=matrix[i][j];
        //     }

        //o(n) time complexity
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i) //for middle element
            sum+=matrix[i][matrix.length-i-1];
        }
 return sum;
}
public static void main(String args[]){
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                    System.out.println(diagsum(matrix));
}
}