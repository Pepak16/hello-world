/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_exercises_20160926_statcalc;

import java.util.Scanner;

/**
 *
 * @author dbj
 */
public class StatCalcStart {
    
    public static void main(String[] args) {
        StatCalc calc = new StatCalc();
        
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Write number: ");
            double number = scanner.nextDouble();
            
            if (number == 0) {
                break;
            }
            else {
                calc.enter(number);
            }
        } while (true);
        
        if (calc.getCount() > 0) {
            System.out.println(calc.printNumbers());
            System.out.println("count " + calc.getCount());
            System.out.println("min   " + calc.getMin());
            System.out.println("max   " + calc.getMax());
            System.out.println("mean  " + calc.getMean());
            System.out.println("sd    " + calc.getStandardDeviation());
            System.out.println("sum   " + calc.getSum());
        }
    }
    
}
