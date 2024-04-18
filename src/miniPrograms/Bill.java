package miniPrograms;

import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double bill;
        double tip;
        double tipRate;
        double totalBill;
        int service;

        // input validation for the bill
        while (true) {
            System.out.println("How much was your bill?");
            try {
                bill = Double.parseDouble(console.next());
                break;
            } catch (NumberFormatException err){
                System.out.println("Invalid bill input!");
            }
        }

        if (bill > 0) {
            System.out.println("How was your service?");
            System.out.println(" 1. Excellent");
            System.out.println(" 2. Good");
            System.out.println(" 3. Fair");
            System.out.println(" 4. Poor");
            service = console.nextInt();
            console.close();

            switch(service) {
                case 1: tipRate = .25;
                        break;
                case 2: tipRate = .20;
                        break;
                case 3: tipRate = .15;
                        break;
                case 4: tipRate = .10;
                        break;
                default: tipRate = 0;
                         break;
            }

            tip = tipCalculator(bill, tipRate);
            totalBill = bill + tip;
            System.out.println("Bill is: $" + bill);
            System.out.println("Your total bill is: $" + totalBill);

        } else {

            System.out.println("You didn't spend any money!");

        }

        System.out.println("Goodbye");
    }

    public static double tipCalculator(double bill, double tipRate ) {
        double tip;
        tip = bill * tipRate;
        return tip;
    }

}

