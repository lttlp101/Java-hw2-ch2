
//
// ------------------------------------------
/*
    @brief This Program:
    a) Write the pseudocode and the Java program to calculate future value of an
       investment using compound interest and estimate the value of π .
    b) Value of π can be estimated using a formula such as:
            pi = 4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + 1/13).
       The program should calculate and display the value of π.
 */
//
// ------------------------------------------
//
//


import java.util.Scanner;
import java.text.NumberFormat;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

public class CIT130hw2ch2 {
    public static void main(String[] args) {

        String chaper2Title = "\n\nChapter 2 - Selections\n";
        System.out.println(chaper2Title);

        //
        // ------------------------------------------
        //
        //  PART 1: Pseudocode
        //
        // ------------------------------------------
        //

        // ------------------------------------------
        //
        //   0) Pseudocode calculate future value of
        //         an investment
        //
        // ------------------------------------------

        // Initiate Variables and NumberFormat Object
        String title0 = "\n0) Pseudocode for calculating future value of an investment \n";
        // Display Title for Part 0
        System.out.println(title0);

        // Pseudocode
        String displayPseudocode = "01) Start\n" +
                "02) Write \"Enter the original balance: \"\n" +
                "03) Input principal\n" +
                "04) Write \"Enter the annual interest rate: \"\n" +
                "05) Input annualRate\n" +
                "06) Write \"Enter the number of times per year that the interest is compounded: \"\n" +
                "07) Input times\n" +
                "08) Write \"Enter the number of years for the account to earn interest: \"\n" +
                "09) Input years\n" +
                "10) Set balance = principal * (1 + annualRate / times)^(times * years)\n" +
                "11) Write \"************ ACME BANK ************\"\n" +
                "12) Write \"Original Balance = $\" + principal\n" +
                "13) Write \"Annual interest rate = \" + annualRate + \"%\"\n" +
                "14) Write \"Interested compounded \" + times + \" times per year\"\n" +
                "15) Write \"Number of years = \" + years + \" years\"\n" +
                "16) Write \"Final balance after \" + years + \" years at an annual rate of \"\n" +
                "           + annualRate + \"% \" + \"compounded \" + times\n" +
                "           + \" times per year is: $\" + balance \" dollars\"\n" +
                "17) End";

        // Display Pseudocode
        System.out.println(displayPseudocode);
        System.out.println("\n");

        //
        // ------------------------------------------
        //
        //  PART 2: Java Program
        //
        // ------------------------------------------
        //

        // ------------------------------------------
        //
        //   A) Calculate Investment
        //
        // ------------------------------------------

        // Initiate Variables and NumberFormat Object
        String title1 = "\n1) Future Value of an Investment Calculation \n";
        String title2 = "\n\n2) Estimated Value of PI (π) \n";
        String header = "\n************ ACME BANK ************";

        // Display Title for Part A
        System.out.println(title1);

        // Create Read Input Object
        Scanner inputs = new Scanner(System.in);

        // Inputs
        System.out.print("Enter the original balance: ");
        double principal = inputs.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        int annualRate = inputs.nextInt();
        System.out.println("Enter the number of times per year that the interest is compounded: ");
        int times = inputs.nextInt();
        System.out.println("Enter the number of years for the account to earn interest: ");
        int years = inputs.nextInt();

        // Calculation
        double balance = principal * Math.pow((1 + (annualRate / 100.0) / times), (times * (double)years));

        // Formatting (Add Currency and Percentage Sign)
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(balance);
        String annualRateFormatted = annualRate + "%";

        // Outputs
        System.out.println("\n" + header);
        System.out.println("Original Balance = " + currency.format(principal));
        System.out.printf("Annual interest rate = %s %n", annualRateFormatted);
        System.out.printf("Interested compounded %d times per year %n", times);
        System.out.printf("Number of years = %d years %n", years);
        System.out.printf("Final balance after %d years at an annual rate of %s compounded %d times per year is: %s %n",
                years,
                annualRateFormatted,
                times,
                balanceFormatted);


        // ------------------------------------------
        //
        //   B) Estimate the Value of PI (π)
        //       pi = 4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + 1/13)
        //
        // ------------------------------------------

        // Display Title for Part B
        System.out.println(title2);

        // Calculation PI

        // method 1
        /*
        double pi = 4 * (1
                - 1.0 / 3.0
                + 1.0 / 5.0
                - 1.0 / 7.0
                + 1.0 / 9.0
                - 1.0 / 11.0
                + 1.0 / 13.0
                - 1.0 / 15.0
                + 1.0 / 17.0
                - 1.0 / 19.0
                + 1.0 / 21.0
                - 1.0 / 23.0
                + 1.0 / 25.0);
         */

        // method 2

        double pi = 0.0;
        int denominator = 1;
        int timesOfNumbers = 10000; // the more numbers the more precise of pi can get

        for (int i = 1; i <= timesOfNumbers; i++) {
            if (i % 2 == 0) {
                pi -= 4.0 / denominator;
            }
            else {
                pi += 4.0 / denominator;
            }
            denominator += 2;
        }

        // Output
        System.out.println("Estimated value of PI (π) = " + pi + "\n");

    }

}
