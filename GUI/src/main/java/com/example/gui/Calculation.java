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
        double standardDeviation=sqrt(sumOfSquare/input.length);
        return standardDeviation;
    }

    /**
     * Self-made sqrt function to avoid math.sqrt. Using binary search
     * Can adjust tolerance to get faster or more accurate result
     * @param input the number need for calculation
     * @return the sqrt of the number
     */
    public static double sqrt(double input){
        double tolerance =0.000000001;

        if (input < 0) {
            throw new IllegalArgumentException("Negative input: " + input);
        }

        double current = input/2;

        double currentHighLimit=input+1;
        double currentLowLimit=0;
        while (abs(current*current-input)>tolerance){
            if(current*current>input){
                currentHighLimit=current;
            }else{
                currentLowLimit=current;
            }
            current=(currentHighLimit+currentLowLimit)/2;
        }
        return current;
    }

    /**
     * Self-made abs to replace math.abs
     * @param input the number need for calculation
     * @return the absolute value of the input
     */
    public static double abs(double input){
        return input>0?input:-input;
    }

    /**
     * Function to handle inputString
     * @param inputString the String from keyboard or textarea
     * @return the standard deviation from the given input
     * @throws Exception Mostly NumberFormatException when input have wrong input type or empty input
     */
    public static double getStandardDeviationWithString(String inputString) throws Exception{
        String[] inputArray=inputString.split("[\\n\\s,]+");
        if (inputArray.length==0){
            throw new NumberFormatException("Empty String");
        }
        double[] numbers=new double[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            numbers[i]=Double.parseDouble(inputArray[i]);
        }
        return getStandardDeviation(numbers);
    }
}
