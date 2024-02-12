import java.util.Scanner; // Import Scanner from Java
public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read user input
        double firstNum; // Initialize the first number
        double secondNum; // Initialize the second number
        System.out.println("Enter the first number: "); // Prompts user to enter the first number
        if(scan.hasNextInt()) { // If the next input can be read as an integer
            firstNum = scan.nextInt(); // Gets input for first number
            System.out.println("Enter the second number: "); // Prompts user to enter the second number
            if(scan.hasNextInt()) { // Nested if statement to check if the next input can be read as an integer
                secondNum = scan.nextInt(); // Gets input for second number
                if(firstNum < secondNum) { // If first number is less than second number
                    System.out.println("The first number you entered "+firstNum+" is the smaller number."); // Returns output saying that the first number is the smaller number
                }
                else if(secondNum < firstNum) { // If second number is less than the first number
                    System.out.println("The second number you entered "+secondNum+" is the smaller number."); // Returns output saying that the second number is the smaller number
                }
                else { // If no number is less than the other (the numbers must be equal)
                    System.out.println("The two numbers you entered are equal."); // Returns output saying that the numbers are equal
                }
            }
            else { // If the next input cannot be read as an integer
                System.out.println("Please try again!");
            }
        }
        else { // If the next input cannot be read as an integer
            System.out.println("Please try again!");
        }
    }
}
