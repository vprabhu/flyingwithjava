package hackersrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by root on 10/5/17.
 */
public class DayTwoOperators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        int mealCostInt = (int) Math.abs(mealCost);
        //calculating tip percent
        double tipPercentCost = (((float) tipPercent/100)*mealCost);
        // calculating tax percent
        double taxPercentCost = (((float) taxPercent/100)*mealCost);

        double totalPrice = mealCost + tipPercentCost + taxPercentCost;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalPrice);
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");

    }

}
