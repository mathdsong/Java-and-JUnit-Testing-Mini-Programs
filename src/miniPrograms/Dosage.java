package miniPrograms;

import java.util.Scanner;

public class Dosage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weight (kg or lbs):");
        double weight = sc.nextDouble();
        System.out.println("Is it in kg? Please Enter 'YES' or 'NO'");
        String inKg = sc.next();
        String unit = "";
        double copy_weight = 0;

        if (inKg.equals("NO")) {
            copy_weight = weight;
            unit = "lbs";
            // convert pounds to kg:
            weight /= 2.2;
        }
        if (unit.isEmpty()) {
            unit = "kg";
        }
        System.out.println("What is the dosage per kg per day?");
        double dosagePerKgPerDay = sc.nextDouble();
        System.out.println("How many doses you need to take per day?");
        int frequency = sc.nextInt();
        // calculate the milligrams per dose:
        double mgPerDose = dosagePerKgPerDay * weight / frequency;
        System.out.println("What is the concentration of the prescription in (mg/ml) ?");
        double concentration = sc.nextDouble();
        // calculate the volume per dose in milliLiter:
        double mLPerDose = mgPerDose / concentration;

        if (unit.equals("lbs")) {
            System.out.println("The dosage for the person who is " + copy_weight + unit + " :" + mLPerDose + "mL");
        } else {
            System.out.println("The dosage for the person who is " + weight + unit + ":" + mLPerDose + "mL");
        }
    }
}
