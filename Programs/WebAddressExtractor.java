import java.util.Locale;
import java.util.Scanner;

/**
 * Asks for a web address, and splits it into  3 parts (heading,company and extension)
 * @author Brandon Lee Felix
 * @since 17/9/21
 */

public class WebAddressExtractor {

    public static void main(String[] args) {
	// write your code here

        //asks to input address
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a web address:  ");
        String address = input.nextLine();

        int addressLength = address.length();

        //formatting declared
        String format = "%-9s %1s %1s %n";
        String header0 = "Address";
        String header1 = "Heading";
        String header2 = "Company";
        String header3 = "Extension";

        String heading = address.substring(0,3);
        String company = address.substring( 4 , addressLength -4);
        String extension = address.substring(3, addressLength);


        System.out.printf(format, header0, ":", address.toLowerCase());

        System.out.printf(format, header1, ":", heading.toLowerCase());
        System.out.printf(format, header2, ":", company.toLowerCase());
        System.out.printf(format, header3,  ":", extension.toLowerCase());



    }
}
