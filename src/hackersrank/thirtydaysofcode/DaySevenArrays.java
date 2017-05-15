package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 5/15/17.
 */
public class DaySevenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=1 || n>=1000){
            return;
        }
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]<=1 || arr[i]>=10000){
                return;
            }
        }
        in.close();

        int initialIndex = arr.length-1;
        for (int i = initialIndex; i>=0 ; i--) {
            if(i==initialIndex){
                System.out.print(arr[i]);
            }else{
                System.out.print(" "+arr[i]);
            }
        }
    }
}
