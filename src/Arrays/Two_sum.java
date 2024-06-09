package Arrays;

import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {11,3,7,9,14,2};
        int target = 17;
        int[] ans = new int[2];

        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int secondNum = target - arr[i];
            if(map.containsKey(secondNum)){
                ans[0] =  map.get(secondNum);
                ans[1] = i;
                break;
            }
//            if the value is not in the map then collect it by below method
            map.put(arr[i],i);
        }
        System.out.println(ans[0] + " "+ans[1]);

    }
}
