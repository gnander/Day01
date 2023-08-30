import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1582) {
            boolean isLeapYear = false;

            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }

        scanner.close();
    }
}