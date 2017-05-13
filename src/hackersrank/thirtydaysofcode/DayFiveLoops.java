package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 5/13/17.
 */
public class DayFiveLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if(n>=2 && n<=20){
            for (int i = 1; i <= 10; i++) {
                System.out.println(n+" x "+ i +" = "+n*i);
            }   
        }
    }
}
