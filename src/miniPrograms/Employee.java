package miniPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Employee {

    public static String centerString (int width, String s) {
        String half_padding = " ".repeat((width - s.length())/2);
        return half_padding + s + half_padding;
    }
    public static void main(String[] args) {
        // create a sample containing department names and corresponding employees numbers
        HashMap<String, Integer> depts = new HashMap<>();
        depts.put("Marketing", 20);
        depts.put("Sales", 56);
        depts.put("Engineering", 30);
        depts.put("Information Technology", 36);
        depts.put("Business Development", 26);
        depts.put("Research and Development", 12);
        depts.put("Operations", 22);
        depts.put("Quality Assurance", 6);

        String dash = "-";
        String formatted = "|%1$-17s|%2$-30s|";
        System.out.println("Please choose a department: \n" + dash.repeat(50));
        System.out.format(formatted, centerString(17, "department code"), centerString(30, "department name"));
        System.out.println();
        System.out.println(dash.repeat(50));
        int index = 0;
        ArrayList<String> deptList = new ArrayList<>();
        for (String deptName: depts.keySet()) {
            index++;
            System.out.format(formatted, centerString(17, String.valueOf(index)), centerString(30, deptName));
            System.out.println();
            deptList.add(deptName);
            System.out.println(dash.repeat(50));
        }

        Scanner sc = new Scanner(System.in);
        // perform input validation:
        var deptCode = "0";
        while (Integer.parseInt(deptCode) > depts.size() || Integer.parseInt(deptCode) <= 0) {
            // prompt the HR to enter the department code, for simplicity, department codes in our cases will be 1 through 8:
            System.out.print("Which department do you want to check? Please enter the associated department code: ");
            deptCode = sc.nextLine();
            // if the code entered is not an integer or if it's blank:
            while (!deptCode.matches("^-?\\d*$") || deptCode.matches("^\\s*$")) {
                System.out.println("The department code you entered is invalid: '" + deptCode + "'");
                System.out.print("The department code should be an integer, please re-enter it: ");
                deptCode = sc.nextLine();
            }

            if (Integer.parseInt(deptCode) > depts.size() || Integer.parseInt(deptCode) <= 0) {
                System.out.println("There is no such department code on the list, please double check the the list range");
            }
        }

        sc.close();

        // get the department name and number of employees based on the department code:
        String deptName = deptList.get(Integer.parseInt(deptCode) - 1);
        int countOfEmployees = depts.get(deptName);

        // print out each employee's info:
        for (int i = 1; i <= countOfEmployees; i++) {
            System.out.println("Here is the info of employee No." + i + " from the department of " + deptName);
        }
    }
}
