package Assignment1_from_Chapter2_4;
/* 3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
 Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities. */

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize all instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);       // use setter to enforce validation
        setPricePerItem(pricePerItem); // use setter to enforce validation
    }

    // Setters and Getters
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
/* invoice test */

public class InvoiceTest {
    public static void main(String[] args) {
        // Create an invoice
        Invoice invoice = new Invoice("1234", "Hammer", 3, 19.99);

        // Display details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.printf("Total Invoice Amount: $%.2f\n", invoice.getInvoiceAmount());
    }
}
/* Answer 3.12 is 
 * 
 * Part Number: 1234
Description: Hammer
Quantity: 3
Price per Item: $19.99
Total Invoice Amount: $59.97
 */

 /* 3.13 (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
 Then give each Employee a 10% raise and display each Employee’s yearly salary again. */

 public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);  // validate salary
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to get yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to increase salary by percentage
    public void giveRaise(double percent) {
        if (percent > 0) {
            monthlySalary = monthlySalary * (1 + percent / 100);
        }
    }
}

/*  3.13 employment  */

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Alice", "Johnson", 3000.00);
        Employee emp2 = new Employee("Bob", "Smith", 4500.00);

        // Display initial yearly salaries
        System.out.println("Initial Yearly Salaries:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give 10% raise to each employee
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display updated yearly salaries
        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
/*  3. 13 employement test*/

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Alice", "Johnson", 3000.00);
        Employee emp2 = new Employee("Bob", "Smith", 4500.00);

        // Display initial yearly salaries
        System.out.println("Initial Yearly Salaries:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give 10% raise to each employee
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display updated yearly salaries
        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
/* 3.13 Answer is 
 * Initial Yearly Salaries:
Alice Johnson: $36000.00
Bob Smith: $54000.00

Yearly Salaries After 10% Raise:
Alice Johnson: $39600.00
Bob Smith: $59400.00 */

/* 3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/). 
Write a test app named DateTest that demonstrates class Date’s capabilities. */

public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Display method
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
/* 3.14 date test */

public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(7, 20, 2025);

        // Display the date
        System.out.print("The date is: ");
        date.displayDate();

        // Change the date using setters
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2025);

        // Display the new date
        System.out.print("Updated date is: ");
        date.displayDate();
    }
}
The date is: 7/20/2025
Updated date is: 12/25/2025
/*3.15  */
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Duplicated print statements
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        account1.deposit(25.0);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        account2.deposit(10.0);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
/* Create the displayAccount method to remove duplication */

public static void displayAccount(Account accountToDisplay) {
    System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());

}
/* Step 4: Replace all duplicated print statements in main with calls to displayAccount */

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        account1.deposit(25.0);

        displayAccount(account1);
        displayAccount(account2);

        account2.deposit(10.0);

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
/* 3.15 Answer is 
 * Jane Green balance: $50.00
John Blue balance: $0.00
Jane Green balance: $75.00
John Blue balance: $0.00
Jane Green balance: $75.00
John Blue balance: $10.00
 */
/*  3.16 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Setters and getters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    // Calculate age based on current date
    public int getAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();
        if (birthDate.isAfter(today)) {
            return 0; // Invalid birth date in future
        }
        return Period.between(birthDate, today).getYears();
    }

    // Calculate maximum heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Calculate target heart rate range (50% - 85% of max)
    public String getTargetHeartRate() {
        int maxHR = getMaxHeartRate();
        int lowerBound = (int)(maxHR * 0.5);
        int upperBound = (int)(maxHR * 0.85);
        return lowerBound + " - " + upperBound + " beats per minute";
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (e.g., 1990): ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("\n--- Heart Rate Information ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate() + " beats per minute");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRate());
        
        input.close();
    }
}
/*3.17 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double heightInches;
    private double weightPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender,
                         int birthMonth, int birthDay, int birthYear,
                         double heightInches, double weightPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    // Setters and getters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public double getHeightInches() { return heightInches; }
    public void setHeightInches(double heightInches) { this.heightInches = heightInches; }

    public double getWeightPounds() { return weightPounds; }
    public void setWeightPounds(double weightPounds) { this.weightPounds = weightPounds; }

    // Calculate age
    public int getAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();
        if (birthDate.isAfter(today)) {
            return 0; // Invalid birth date in future
        }
        return Period.between(birthDate, today).getYears();
    }

    // Calculate max heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Calculate target heart rate range
    public String getTargetHeartRate() {
        int maxHR = getMaxHeartRate();
        int lowerBound = (int)(maxHR * 0.5);
        int upperBound = (int)(maxHR * 0.85);
        return lowerBound + " - " + upperBound + " beats per minute";
    }

    // Calculate BMI: BMI = (weight in pounds * 703) / (height in inches)^2
    public double getBMI() {
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    // Display BMI values chart (from Exercise 2.33)
    public static void displayBMIChart() {
        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater\n");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender (M/F): ");
        String gender = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (e.g., 1990): ");
        int year = input.nextInt();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        HealthProfile person = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);

        System.out.println("\n--- Health Profile ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Height: " + person.getHeightInches() + " inches");
        System.out.println("Weight: " + person.getWeightPounds() + " pounds");

        System.out.println("Age: " + person.getAge() + " years");
        System.out.printf("BMI: %.2f\n", person.getBMI());
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate() + " beats per minute");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRate());

        displayBMIChart();

        input.close();
    }
}