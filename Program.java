//import stuff here

//Your code here
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Asking for two integers
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        // Basic calculations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        double avg = (num1 + num2) / 2.0; // Calculate average (requires double)
        int absDiff = Math.abs(diff);     // Absolute difference using Math.abs()

        // Manually calculate max and min without using advanced functions
        int maxVal = (num1 > num2) ? num1 : num2;
        int minVal = (num1 < num2) ? num1 : num2;

        // Output: Display results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute difference = " + absDiff);
        System.out.println("Maximum = " + maxVal);
        System.out.println("Minimum = " + minVal);
    }
}
//Paste console output below:
/*


*/
