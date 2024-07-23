package com.example.gui;

public class Calculation {

    /**
     * Core function for calculation of standard deviation
     * @param input an array of double for numbers need to calculate
     * @return the standard deviation from the given input
     */
    public static double getStandardDeviation(double[] input){
        double sum=0;
        for (double num:input){
            sum+=num;
        }
        double average= sum/input.length;
        double sumOfSquare= 0;
        for (double num:input){
            sumOfSquare+=(average-num)*(average-num);
        }
        double standardDeviation=Math.sqrt(sumOfSquare/input.length);
        return standardDeviation;
    }

    /**
     * Function to handle inputString
     * @param inputString the String from keyboard or textarea
     * @return the standard deviation from the given input
     * @throws Exception Mostly NumberFormatException when input have wrong input type or empty input
     */
    public static double getStandardDeviationWithString(String inputString) throws Exception{
        String[] inputArray=inputString.split("[\\n\\s,]+");
        double[] numbers=new double[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            numbers[i]=Double.parseDouble(inputArray[i]);
        }
        return getStandardDeviation(numbers);
    }
}
