import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to F8 demo: standard deviation function" +
                "\nPlease enter number in integer or double, split by space or tab; Press Enter to finish:");
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.nextLine();
        String[] inputArray=inputString.split("[\\s,]+");
        try{// for wrong type and empty input error
            double[] numbers=new double[inputArray.length];
            for(int i=0;i<inputArray.length;i++){
                numbers[i]=Double.parseDouble(inputArray[i]);
            }

            System.out.println(getStandardDeviation(numbers));
        }catch (Exception e){
            System.out.println("There are something wrong with the input, please check if the input type or number is correct");
        }
    }

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
}