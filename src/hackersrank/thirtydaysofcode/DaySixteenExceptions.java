package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 6/5/17.
 */
public class DaySixteenExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
