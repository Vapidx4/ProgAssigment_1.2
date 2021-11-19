import java.util.Arrays;
import java.util.Scanner;

/**
 * The user inputs 5 numbers and the console returns the max, min, mean and standard deviation.
 * @author Brandon Lee Felix
 *
 */

public class SimpleStatisticCalculator {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input 5 numbers separated by a space:");
        String numbers = scan.nextLine();

        char charString1 = numbers.charAt(0);
        char charString2 = numbers.charAt(2);
        char charString3 = numbers.charAt(4);
        char charString4 = numbers.charAt(6);
        char charString5 = numbers.charAt(8);

        int i1 = Character.getNumericValue(charString1);
        int i2 = Character.getNumericValue(charString2);
        int i3 = Character.getNumericValue(charString3);
        int i4 = Character.getNumericValue(charString4);
        int i5 = Character.getNumericValue(charString5);


        double d1 = i1;
        double d2 = i2;
        double d3 = i3;
        double d4 = i4;
        double d5 = i5;

        //Converts the double value to a string.

        String s1 = String.format("%.2f",d1);
        String s2 = String.format("%.2f",d2);
        String s3 = String.format("%.2f",d3);
        String s4 = String.format("%.2f",d4);
        String s5 = String.format("%.2f",d5);



        String header1 = "Numbers";
        String header2 = "Mean";
        String header3 = "Minimum";
        String header4 = "Maximum";
        String header5 = "Standard Deviation";
        String colon = ":";
        double mean = (d1 + d2 + d3 + d4 + d5)/5;

        //Sorts from lowest to highest
        double[] numbSort={d1,d2,d3,d4,d5};
        Arrays.sort(numbSort);

        //Standard Deviation
        double standardDeviation = Math.sqrt((Math.pow(d1-mean,2) + Math.pow(d2-mean,2) + Math.pow(d3-mean,2) + Math.pow(d4-mean,2) + Math.pow(d5-mean,2))/5);


        //Creates string
        String format = "%-19s %1s %.2f %n";
        String format2 = "%-19s %1s %s %s %s %s %s %n";


        System.out.printf(format2, header1, colon, s1 +",", s2 +",", s3 +",", s4 +",", s5);
        System.out.printf(format, header2, colon, mean);
        System.out.printf(format, header3, colon, numbSort[0]);
        System.out.printf(format, header4, colon, numbSort[numbSort.length-1]);
        System.out.printf(format, header5, colon, standardDeviation);



    }
}
