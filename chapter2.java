package Assignment1_from_Chapter2_4;
/* 2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers 
separated by one space. Use the following techniques: Use one System.out.println statement. Use four System.out.
print statements. Use one System.out.printf statement */


public class NumbersWithPrintln {
    public static void main(String[] args) {
        System.out.println("1 2 3 4");
    }
}

public class NumbersWithPrint {
    public static void main(String[] args) {
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n"); // Add \n to move to the next line
    }
}
public class NumbersWithPrintf {
    public static void main(String[] args) {
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    }
    /* Answer is System.out.printf("%d %d %d %d\n", 1, 2, 3, 4); */
}
/*2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines and prints the
 largest and smallest integers in the group */

 import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, largest, smallest;

        System.out.print("Enter integer #1: ");
        number = input.nextInt();
        largest = number;
        smallest = number;

        // Read the remaining 4 integers
        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter integer #" + i + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("\nThe largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        
        input.close();
    }
}
 /* Answer Enter integer #1: 14  
Enter integer #2: 22  
Enter integer #3: -5  
Enter integer #4: 18  
Enter integer #5: 7 */

/* The largest number is: 22  
The smallest number is: -5 */

/* 2.24 Largest and Smallest Integers) Write an application that reads five integers and determines and prints
 the largest and smallest integers in the group. Use only the programming techniques you learned in this chapter */

 import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, largest, smallest;

        // Read the first number and initialize both largest and smallest
        System.out.print("Enter integer 1: ");
        number = input.nextInt();
        largest = smallest = number;

        // Read the remaining 4 numbers
        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt();

            if (number > largest)
                largest = number;

            if (number < smallest)
                smallest = number;
        }

        // Print results
        System.out.println("\nLargest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        input.close();
    }
}

/* 2.4 Answer is 
 
Enter integer 1: 32
Enter integer 2: 7
Enter integer 3: 19
Enter integer 4: 88
Enter integer 5: 15

Largest number: 88
Smallest number: 7
 */

 */

/*2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple
 of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.] */

 public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Use remainder operator to check if number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
/* The answer is Enter an integer: 42
42 is even.

Enter an integer: 17
17 is odd.
 
 */
/* 2.26 (Multiples) Write an application that reads two integers, 
determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.] */

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Check if the first number is a multiple of the second
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is NOT a multiple of " + num2);
        }

        input.close();
    }
}
/* Answer is Enter the first integer: 12
Enter the second integer: 4
12 is a multiple of 4 
and 

Enter the first integer: 13
Enter the second integer: 5
13 is NOT a multiple of 5

*/
/*  2.34 (World Population Growth Calculator) Search the Internet to determine the current world population and the annual world population growth rate. Write an application that inputs these values, 
then displays the estimated world population after one, two, three, four and five years. */

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population (billions): ");
        double current = input.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double rate = input.nextDouble() / 100.0;

        System.out.println("\nEstimated population in:");
        for (int year = 1; year <= 5; year++) {
            current = current * (1 + rate);
            System.out.printf("Year %d: %.3f billion%n", year, current);
        }

        input.close();
    }
}
/* Enter current world population (billions): 8.19
Enter annual growth rate (%): 0.90

Estimated population in:
Year 1: 8.264 billion
Year 2: 8.338 billion
Year 3: 8.413 billion
Year 4: 8.489 billion
Year 5: 8.566 billion */

/* newPopulation = oldPopulation × (1 + rate)  Uses System.out.printf for neat formatting with three decimals. */

