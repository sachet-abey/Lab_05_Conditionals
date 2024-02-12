import java.util.Scanner; // Import Scanner from Java
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read user input
        System.out.println("Enter your age: "); // Prompts user to enter their age
        if(scan.hasNextInt()) { // If the next input can be read as an integer
            int age = scan.nextInt(); // Gets input for age
            if(age >= 21) { // If age is greater than or equal to 21 (age restriction to enter the theater)
                System.out.println("You get a paper wrist band!"); // Returns output saying the user gets a paper wrist band
            }
        }
    }
}
