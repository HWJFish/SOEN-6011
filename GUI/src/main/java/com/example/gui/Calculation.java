package com.example.gui;

public class Calculation {
    // Core function for calculation
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

    public static double getStandardDeviationWithString(String inputString) throws Exception{
        String[] inputArray=inputString.split("[\\s,]+");
        double[] numbers=new double[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            numbers[i]=Double.parseDouble(inputArray[i]);
        }
        return getStandardDeviation(numbers);
    }
}
