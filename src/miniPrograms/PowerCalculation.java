package miniPrograms;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        System.out.println("The power is: " + powerOfAnInteger());
    }

    public static int powerOfAnInteger() {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponent;
        System.out.print("Enter an integer base:");
        base = sc.nextInt();
        System.out.print("Enter an integer exponent:");
        exponent = sc.nextInt();
        return (int)Math.pow(base, exponent);
    }

}
