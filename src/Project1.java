import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        Scanner myBeloved = new Scanner(System.in); //Scanner my beloved

        System.out.println("How much was your bill?");
        double bill = myBeloved.nextDouble();

        System.out.println("What percentage are you tipping? (as an integer value)");
        int tipPercent = myBeloved.nextInt();
        double actualPercent = (double) tipPercent / 100;

        System.out.println("How many people are in your party?");
        int headCount = myBeloved.nextInt();

        double tipTotal = bill * actualPercent;
        double tipEach = tipTotal / headCount;

        tipTotal = Math.round(tipTotal * 100.00) / 100.00;
        tipEach = Math.round(tipEach * 100.00) / 100.00;

        String billString = String.valueOf(bill);
        String tipPercentString = String.valueOf(tipPercent);
        String headCountString = String.valueOf(headCount);
        String tipTotalString = String.valueOf(tipTotal);
        String tipEachString = String.valueOf(tipEach);

        System.out.println();
        System.out.println("Your bill is $" + billString);
        System.out.println("Your tip percentage is " + tipPercentString + "%");
        System.out.println("You have " + headCountString + " people in your party" );
        System.out.println("Your total tip is $" + tipTotalString);
        System.out.println("Your individual tip is $" + tipEachString + " each");
    }
}
//small note to myself after I closed by file:
//NumberFormat formatter = new DecimalFormat("#0.00");     
//System.out.println(formatter.format(4.0));
//Attempt this later at home
