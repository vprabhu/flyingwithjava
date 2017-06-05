package hackersrank.thirtydaysofcode.DaySeventeenExceptions;

/**
 * Created by root on 6/5/17.
 */
class Calculator {

    int power(int number , int power) throws Exception {
        int result = 0;
        if(number < 0 || power < 0){
            throw new Exception("n and p should be non-negative");
        }
        if(power > 0){
            for (int i = 0; i < power; i++) {
                if(i == 0){
                    result = number;
                }else {
                    result = result * number;
                }
            }
        }else {
            result = 1;
        }

        return result;
    }
}
