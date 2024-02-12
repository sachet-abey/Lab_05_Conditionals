import java.util.Scanner; // Import Scanner from Java
public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read user input
        System.out.println("Enter your birth month (integer 1-12 inclusive): "); // Prompts user to enter their birth month
        if(scan.hasNextInt()) { // If the next input can be read as an integer
            int birthMonth = scan.nextInt(); // Get birth month input
            if(birthMonth >= 1 && birthMonth <= 12) { // If the birth month value is within the range (1-12 inclusive)
                System.out.println("Your birth month is "+birthMonth); // Echoes input since birth month is in range
            }
            else { // If the birth month value is not within the range
                System.out.println("You entered an incorrect month value: "+birthMonth); // Returns an error message because input is not in range
            }
        }
    }
}
