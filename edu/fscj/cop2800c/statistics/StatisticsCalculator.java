// StatisticsCalculator.java
// D. Singletary 
// 10/16/22
// Interface for summary statistics methods

package edu.fscj.cop2800c.statistics;

// interface for statistical calculations
public interface StatisticsCalculator {

    // returns max from array of Double
    public Double max(Double[] inArray) 
         throws ArrayIndexOutOfBoundsException;

    // returns mean from array of Double
    public Double mean(Double[] inArray) 
         throws ArrayIndexOutOfBoundsException;;
    
    public Double stddev(Double[] inArray) 
         throws ArrayIndexOutOfBoundsException;
}