/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapmonth;

import java.util.Scanner;
public class leapmonth {
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
    public static void main(String[] args) {
        System.out.print("Leap Month Calculator\n");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';
        while (choice == 'y' || choice == 'Y') {
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            System.out.print("Enter the month (1-12): ");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Month must be between 1 and 12.");
                return;
            }
            if (isLeapMonth(year, month)) {
                System.out.println("The " + month + " month "+" of year " + year + " is a leap month.");
            } else {
                System.out.println("The " + month + " month "+" of year " + year + " is not a leap month.");
            }
            System.out.println("Do you want to check for another Month (Y/N)");
            choice = scanner.next().charAt(0);
        }
        scanner.close();
    }
}
