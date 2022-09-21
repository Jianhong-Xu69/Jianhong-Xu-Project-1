import java.text.DecimalFormat;//formatting decimals
import java.text.NumberFormat;//formatting
import java.util.Scanner;//inputs
public class Project1 {
    public static void main(String[] args) {
        Scanner myBeloved = new Scanner(System.in); //Scanner my beloved
        NumberFormat formatter = new DecimalFormat("#0.00");//shamelessly stolen off of a web forum I sure hope this works

        System.out.println("How much was your bill?");//ask for the amount billed
        double bill = myBeloved.nextDouble();

        System.out.println("What percentage are you tipping? (as an integer value)");//ask for the percent tip
        int tipPercent = myBeloved.nextInt();
        double actualPercent = (double) tipPercent / 100;

        System.out.println("How many people are in your party?");//ask for amount of people
        int headCount = myBeloved.nextInt();

        double tipTotal = bill * actualPercent;//calculations
        double tipEach = tipTotal / headCount;
        double totalBill = bill + tipTotal;
        double totalEach = totalBill / headCount;

        tipTotal = Math.round(tipTotal * 100.00) / 100.00;//rounding
        tipEach = Math.round(tipEach * 100.00) / 100.00;

        String billString = (formatter.format(bill)); //oh my goodness gracious it works
        String tipPercentString = String.valueOf(tipPercent);//formatting the decimals and type casting to string
        String headCountString = String.valueOf(headCount);
        String tipTotalString = (formatter.format(tipTotal));
        String tipEachString = (formatter.format(tipEach));
        String totalBillString = (formatter.format(totalBill));
        String totalEachString = (formatter.format(totalEach));

        System.out.println();//printing out the results
        System.out.println("Your bill is $" + billString);
        System.out.println("Your tip percentage is " + tipPercentString + "%");
        System.out.println("You have " + headCountString + " people in your party" );
        System.out.println("Your total bill is $" + totalBillString + ", your individual bill is $" + totalEachString + " each");
        System.out.println("Your total tip is $" + tipTotalString + ", your individual tip is $" + tipEachString + " each");
    }
}