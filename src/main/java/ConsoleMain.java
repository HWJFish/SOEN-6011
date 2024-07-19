import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args) {
        System.out.println("Welcome to F8 demo: standard deviation function" +
                "\nPlease enter number in integer or double, split by space or tab; Press Enter to finish:");
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.nextLine();
        try{// for wrong type and empty input error


            System.out.println(Calculation.getStandardDeviationWithString(inputString));
        }catch (Exception e){
            System.out.println("There are something wrong with the input, please check if the input type or number is correct");
        }
    }


}