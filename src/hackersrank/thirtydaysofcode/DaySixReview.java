package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 5/14/17.
 */
public class DaySixReview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<2 || n>10){
            return;
        }
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.next();
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            String even = "" , odd = "";
            for (int j = 0; j < input[i].length(); j++) {
                if(j%2 == 0){
                    even = even + input[i].charAt(j);
                }else {
                    odd = odd + input[i].charAt(j);
                }
            }
            System.out.println(even +" "+odd);
        }
    }
}
