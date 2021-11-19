import java.util.Scanner;
public class ParkingPriceCalculator {

    /**
     * The user input the number of hours parked and the console returns the time in minutes and hours, as well as the price.
     * @author Brandon Lee Felix
     *
     */

    public static void main(String[] args) {
	// write your code here
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please input the number of minutes your car has been parked:");
        double time = myInput.nextDouble();

        String minutes = "Parking time (minutes)";
        String hours = "Parking time (hours)";
        String priceHeader = "Price";
        String colon = ":";
        String format = "%-24s %-1s %d %n";
        String format2 = "%-24s %-1s %.0f %n";
        String format3 = "%-24s %-1s %.2f %n";


        int mins = (int) time;
        double hoursMath = Math.ceil(time/60);
        double price = hoursMath * 2;

        System.out.printf(format, minutes, colon, mins);
        System.out.printf(format2, hours, colon, hoursMath);
        System.out.printf(format3, priceHeader, colon, price);





    }
}
