// importing classes
import java.util.Scanner;
import java.text.DecimalFormat;
    public class TipCalculator {
        public static void main(String[] args) {

            // creating objects
            DecimalFormat formatter = new DecimalFormat("#.##");
            Scanner scan = new Scanner(System.in);
            double totalCost = 0;

            // welcoming the user
            System.out.println("Welcome to the tip calculator!");

            // asking for user inputs and assigning the answers to variables
            System.out.println("How many people are in your group? (Please enter an integer): ");
            int people = scan.nextInt();
            scan.nextLine();
            System.out.println("What's the tip percentage? Enter as an integer from 0 - 100: ");
            int tip = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            double cost = scan.nextDouble();

            // prompting the user to enter the costs until -1 is entered
            while (cost != -1) {
                System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                totalCost += cost;
                cost = scan.nextDouble();
            }

            /* calculating the bill, assigning them to variables
            and formatting the results to the correct decimal places */
            String formatTotalCost = formatter.format(totalCost);
            String formatTip = formatter.format(tip);

            double totalTip = (tip * 0.01) * totalCost;
            String formatTotalTip = formatter.format(totalTip);

            double tipBill = totalTip + totalCost;
            String formatTipBill = formatter.format(tipBill);

            double personCost = totalCost / people;
            String formatPersonCost = formatter.format(personCost);

            double personTip = totalTip / people;
            String formatPersonTip = formatter.format(personTip);

            double personTotal = tipBill / people;
            String formatPersonTotal = formatter.format(personTotal);

            // prints out the information about the bill
            System.out.println("-----------------------------");
            System.out.println("Total Bill Before Tip: " + formatTotalCost);
            System.out.println("Tip Percentage: " + formatTip);
            System.out.println("Total Tip: " + formatTotalTip);
            System.out.println("Total Bill With Tip: " + formatTipBill);
            System.out.println("Per Person Cost Before Tip: " + formatPersonCost);
            System.out.println("Tip Per Person: " + formatPersonTip);
            System.out.println("Total Cost Per Person: " + formatPersonTotal);

        }
    }


