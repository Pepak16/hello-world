/** 
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */
package oop_exercises_20160926_statcalc;

import java.util.ArrayList;
import java.util.List;

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double max;
    private double min;
    private List<Double> list = new ArrayList<Double>();

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        
        if (num > max || max == 0) {
            max = num;
        }
        
        if (num < min || min == 0) {
            min = num;
        }
        list.add(num);
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        if (count > 0) {
            return sum / count;  
        }
        return 0.0;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {  
        if (count > 0) {
            double mean = getMean();
            return Math.sqrt( squareSum/count - mean*mean );
        }
        return 0.0;
    }
    
    public double getMax() {
        return max; //maximum
    }
    
    public double getMin() {
        return min; //minimum
    }
    
    public String printNumbers() {
        StringBuilder builder = new StringBuilder();
        for(Double d : list) {
            builder.append(d.doubleValue()).append(" ");
        }
        return builder.toString();
    }

}  // end class StatCalc
