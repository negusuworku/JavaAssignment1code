/* 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tankful. Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. 
Use class Scanner and sentinel-controlled iteration to obtain the data from the user. */

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break;  // sentinel value to exit loop
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            // calculate and display miles per gallon for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // accumulate totals
            totalMiles += miles;
            totalGallons += gallons;

            // calculate and display overall average so far
            double totalMPG = (double) totalMiles / totalGallons;
            System.out.printf("Total miles per gallon so far: %.2f%n", totalMPG);
        }

        if (totalGallons != 0) {
            System.out.printf("%nFinal combined miles per gallon: %.2f%n", 
                (double) totalMiles / totalGallons);
        } else {
            System.out.println("No trip data was entered.");
        }

        input.close();
    }
}
/* 4.12 Sample Run:

Enter miles driven (-1 to quit): 300
Enter gallons used: 10
Miles per gallon for this trip: 30.00
Total miles per gallon so far: 30.00

Enter miles driven (-1 to quit): 120
Enter gallons used: 6
Miles per gallon for this trip: 20.00
Total miles per gallon so far: 26.67

Enter miles driven (-1 to quit): -1

Final combined miles per gallon: 26.67 */

/*4.20 Salary Calculator) Develop a Java application that determines the gross pay for each of three employees. The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their number of hours worked last week and their hourly rates. Your program should input this information for each employee, 
then determine and display the employee’s gross pay. Use class Scanner to input the data. */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 3;

        for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
            System.out.printf("Enter data for Employee %d:%n", i);

            System.out.print("Hours worked: ");
            double hoursWorked = input.nextDouble();

            System.out.print("Hourly rate: ");
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;
                grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            }

            System.out.printf("Employee %d gross pay: $%.2f%n%n", i, grossPay);
        }

        input.close();
    }
}
/* Answer sample run:
 * 
 * Sample Run:

Enter data for Employee 1:
Hours worked: 38
Hourly rate: 15
Employee 1 gross pay: $570.00

Enter data for Employee 2:
Hours worked: 45
Hourly rate: 20
Employee 2 gross pay: $950.00

Enter data for Employee 3:
Hours worked: 40
Hourly rate: 12.5
Employee 3 gross pay: $500.00
 */

 /* 4.24 */

 import java.util.Scanner;

public class StudentResultsValidated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.printf("Enter result for student %d (1 = pass, 2 = fail): ", studentCounter);
            int result = input.nextInt();

            while (result != 1 && result != 2) {
                System.out.print("Invalid input. Please enter 1 (pass) or 2 (fail): ");
                result = input.nextInt();
            }

            if (result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf("%nPassed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
        
        input.close();
    }
}
/* 4.24 Answer Sample Run:


Enter result for student 1 (1 = pass, 2 = fail): 5
Invalid input. Please enter 1 (pass) or 2 (fail): -1
Invalid input. Please enter 1 (pass) or 2 (fail): 2
Enter result for student 2 (1 = pass, 2 = fail): 1
...
Passed: 9
Failed: 1
Bonus to instructor! */
/* 4.30 */

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;

        // Prompt user until valid size is entered
        do {
            System.out.print("Enter the size of the square (1 to 20): ");
            size = input.nextInt();
        } while (size < 1 || size > 20);

        // Print the hollow square
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                // Print star at borders, space inside
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // New line after each row
        }

        input.close();
    }
}

/* 4.34  */

public class MultiplesOfTwoInfinite {
    public static void main(String[] args) {
        long number = 2;  // Use long to handle larger numbers initially

        while (true) {  // Infinite loop
            System.out.println(number);
            number *= 2;  // Multiply by 2 each iteration
        }
    }
}
/*4.39 */

import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4-digit integer to encrypt: ");
        int number = input.nextInt();

        if (number < 0 || number > 9999) {
            System.out.println("Error: Number must be between 0000 and 9999.");
            input.close();
            return;
        }

        // Extract digits
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Encrypt each digit: (digit + 7) % 10
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Swap first and third digits
        int temp = d1;
        d1 = d3;
        d3 = temp;

        // Swap second and fourth digits
        temp = d2;
        d2 = d4;
        d4 = temp;

        // Combine digits into encrypted number
        int encryptedNumber = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

        System.out.printf("Encrypted number: %04d\n", encryptedNumber);

        input.close();
    }
}
/* 4.39 decreption program*/

import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the encrypted 4-digit integer to decrypt: ");
        int number = input.nextInt();

        if (number < 0 || number > 9999) {
            System.out.println("Error: Number must be between 0000 and 9999.");
            input.close();
            return;
        }

        // Extract digits
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Swap first and third digits back
        int temp = d1;
        d1 = d3;
        d3 = temp;

        // Swap second and fourth digits back
        temp = d2;
        d2 = d4;
        d4 = temp;

        // Decrypt each digit: reverse of (digit + 7) % 10
        // If digit < 7, add 10 before subtracting 7
        d1 = (d1 < 7) ? (d1 + 10 - 7) : (d1 - 7);
        d2 = (d2 < 7) ? (d2 + 10 - 7) : (d2 - 7);
        d3 = (d3 < 7) ? (d3 + 10 - 7) : (d3 - 7);
        d4 = (d4 < 7) ? (d4 + 10 - 7) : (d4 - 7);

        int decryptedNumber = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

        System.out.printf("Decrypted number: %04d\n", decryptedNumber);

        input.close();
    }
}
/*  */
import java.util.Scanner;
import java.text.DecimalFormat;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        // Prompt user input
        System.out.print("Enter the current world population (e.g., 8_000_000_000): ");
        long currentPopulation = input.nextLong();

        System.out.print("Enter the annual growth rate (percentage, e.g., 1.1 for 1.1%): ");
        double growthRate = input.nextDouble() / 100.0;

        long population = currentPopulation;
        int doublingYear = -1;

        System.out.printf("%-6s %-20s %-20s%n", "Year", "Population", "Increase");

        for (int year = 1; year <= 75; year++) {
            long increase = (long) (population * growthRate);
            population += increase;

            System.out.printf("%-6d %-20s %-20s%n", year, df.format(population), df.format(increase));

            // Check for doubling year
            if (doublingYear == -1 && population >= 2 * currentPopulation) {
                doublingYear = year;
            }
        }

        if (doublingYear != -1) {
            System.out.println("\nThe population will double in year: " + doublingYear);
        } else {
            System.out.println("\nPopulation does not double within 75 years at this growth rate.");
        }

        input.close();
    }
}
/* How to use:
Enter the current population as a number, e.g., 8000000000 for 8 billion.

Enter the growth rate as a percent, for example:

1.1 means 1.1% growth per year,

0.7 means 0.7% growth per year.

Explanation:
Population grows by (population * growthRate) each year.

Each year's increase and new population are printed with commas for readability.

The program detects the first year when population doubles.

Uses long for population to handle large numbers.

Uses DecimalFormat to format large numbers with commas. */