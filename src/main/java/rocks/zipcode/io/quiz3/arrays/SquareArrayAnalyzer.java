package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        ArrayList<Integer> squaredArrayList = new ArrayList<>(Arrays.asList(squaredValues));
        Integer temp = 0;
        for (Integer test: input) {
            temp = test * test;
            if(!squaredArrayList.contains(temp)){
                return false;
            }
        }
        return true;
    }
}
