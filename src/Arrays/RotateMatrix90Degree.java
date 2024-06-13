package Arrays;

import javax.swing.*;
import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

//        Expected output

//         [13, 9, 5, 1]
//         [14, 10, 6, 2]
//         [15, 11, 7, 3]
//         [16, 12, 8, 4]


        rotate90(arr);
        print(arr);
    }
    public static void print(int arr[][]){
        for (int[]a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static void rotate90(int arr[][]){
//        Step 1 -> transverse the array by replacing i with j
        for(int row=0;row<arr.length;row++){
            for (int col=row+1;col<arr[row].length;col++){
                int temp = arr[row][col];
                arr[row][col] =arr[col][row];
                arr[col][row]=temp;
            }
        }
//        asign first and last column by left and right
        int left =0, right=arr[0].length-1;
//        step 2 -> replace the columns like 1st to last , 2nd to second last and so on
        while (left<right){
            for (int row = 0; row < arr.length; row++) {
                int temp = arr[row][left];
                arr[row][left]= arr[row][right];
                arr[row][right]=temp;
            }
            left++;
            right--;
        }
    }

}
