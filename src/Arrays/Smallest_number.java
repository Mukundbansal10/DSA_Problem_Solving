package Arrays;

import java.beans.Introspector;
import java.util.Scanner;

//Smallest number whose product of digits is N and N is given
public class Smallest_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println("solution(N) = " + solution(N));
    }
    public static int solution(int N){
        String ans = "";
//        dividing N value again and again , on succesfull division the divisior is concatenated to the String
        for (int i = 9; i >2; i--) {
            while (N%i==0){
                N = N/i;
                ans= i+ans;
            }
        }
        if(N!=1){
            return -1;
        }
        else {
            return Integer.parseInt(ans);
        }
    }
}
