package hackersrank.thirtydaysofcode

import java.util.Scanner

/**
 * Created by root on 10/5/17.
 */
object DayTwoOperators {

    @JvmStatic fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val mealCost = scan.nextDouble() // original meal price
        val tipPercent = scan.nextInt() // tip percentage
        val taxPercent = scan.nextInt() // tax percentage
        scan.close()

        // Write your calculation code here.
        val mealCostInt = Math.abs(mealCost).toInt()
        //calculating tip percent
        val tipPercentCost = tipPercent.toFloat() / 100 * mealCost
        // calculating tax percent
        val taxPercentCost = taxPercent.toFloat() / 100 * mealCost

        val totalPrice = mealCost + tipPercentCost + taxPercentCost

        // cast the result of the rounding operation to an int and save it as totalCost
        val totalCost = Math.round(totalPrice).toInt()
        // Print your result
        println("The total meal cost is $totalCost dollars.")

    }

}
