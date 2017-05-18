package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 18/5/17.
 */
public class DayNineRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        if(n<=2 || n>=12){
            return;
        }
        factorial(n , 1);
    }


    public static void factorial(int n , int resultFactorial){
        int result = resultFactorial;
        if(n!=0){
            result = result * n ;
            n=n-1;
            factorial(n , result);
        }else {
            System.out.println(result);
        }
    }
}
