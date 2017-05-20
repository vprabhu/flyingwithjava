package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 5/20/17.
 */
public class DayTenBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        // convert int to base 2
        String converted = Integer.toString(number, 2);
//        System.out.println(converted);

        // finding consecutive numbers
        String consc[] = converted.split("0");
        int length = 0;
        for (int i = 0; i < consc.length; i++) {
            // comparing array length to find the maximum consecutive numbers
            if(consc[i].length() > length){
                length = consc[i].length();
            }
        }
        System.out.println(length);

    }
}
