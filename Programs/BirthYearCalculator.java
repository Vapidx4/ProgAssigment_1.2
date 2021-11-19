import java.util.Scanner;
public class BirthYearCalculator {

    /**
     * The user inputs a birthyear and the console returns the year, century and decade.
     * @author Brandon Lee Felix
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //asks for birth year as an integer
        System.out.print("Please input a birth year: ");
        int birth = scan.nextInt();

        //converts to string
        String birthString = String.valueOf((birth));

        //gets the first two digits of the "birth year" and adds 1 to it, to get the century.
        int cent = Integer.parseInt(birthString.substring(0,2));
        int century = cent + 1;

        //Gets the 3rd digit and multiplies it by 10 to get the decade
        char dec = String.valueOf(birth).charAt(2);
        int deca = Character.getNumericValue(dec);
        int decade = deca * 10;

        //formatting
        String format = "%-10s%s %-4s %n";
        String birthF ="Birth Year";
        String centuryF ="Century";
        String decadeF ="Decade";
        String colon = ":";

        // prints out format and results
        System.out.printf(format,birthF,colon,birth);
        System.out.printf(format,centuryF,colon,century);
        System.out.printf(format,decadeF,colon,decade);

    }
}
