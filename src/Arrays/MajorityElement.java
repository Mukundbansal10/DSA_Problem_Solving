package Arrays;

//find the element in the array which comes more than n/2 times
//only one majorirty element possible
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,2,4,5,2,2,2,2,5,5,2,2};
        System.out.println("majorityElement = " + majorityElement(arr, arr.length));
    }
    public static int majorityElement(int[] arr,int n){
//        using moore's voting algo
//        check the whole array assign the first element candidate and set count =1 ,if next element is equal to candidate hust increase the counter else reduce
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i <n ; i++) {
            if (arr[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                candidate= arr[i];
                count=1;
            }
        }

//        now check again the array to verify
        count=0;
        for(int val:arr){
            if (val == candidate) {
                count++;
            }
        }
        if (count > n/2) {
            return candidate;
        }
        else {
            return -1;
        }
    }
}
