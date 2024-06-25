package BinarySearch;


//we have to find position or index of the first and last occurence of the target element
public class FirstLastIndexPosition {
    public static void main(String[] args) {
        int []arr = {1,2,2,2,2,3,3,3,3,4,4,5,5,5,6,6,8,8};
        int target = 3;
        firstAndLastPosition(arr,target);
    }

    public static void firstAndLastPosition(int[]arr,int target){
        int leftIndex =0 , rightIndex=arr.length-1;
        int first = -1;

        while (leftIndex<=rightIndex){
//            int midIndex = (leftIndex+rightIndex)/2;
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if(arr[midIndex]==target){
                first=midIndex;
                rightIndex=midIndex-1;
            } else if (arr[midIndex]<target) {
                leftIndex = midIndex+1;
            }else {
                rightIndex =midIndex-1;
            }
        }

        leftIndex =0 ; rightIndex=arr.length-1;
        int lastIndex = -1;

        while (leftIndex<=rightIndex){
//            int midIndex = (leftIndex+rightIndex)/2;
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if(arr[midIndex]==target){
                lastIndex=midIndex;
                leftIndex=midIndex+1;
            } else if (arr[midIndex]<target) {
                leftIndex = midIndex+1;
            }else {
                rightIndex =midIndex-1;
            }
        }
        System.out.println(first+" "+lastIndex);

    }
}
