package hackersrank.thirtydaysofcode.DayFourteenScope;

/**
 * Created by root on 6/5/17.
 */
public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }


    public void computeDifference(){
        maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
            int currentElements = elements[i];
            for (int j = i; j < elements.length; j++) {
                int result = Math.abs(currentElements - elements[j]);
                if(result > maximumDifference) {
                    maximumDifference = result;
                }
                System.out.println(maximumDifference);
            }
        }
    }

}
