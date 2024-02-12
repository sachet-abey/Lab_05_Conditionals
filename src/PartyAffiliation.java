import java.util.Scanner; // Import Scanner from Java
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read user input
        System.out.println("Enter your party affiliation: "); // Prompts user to enter their party affiliation
        String partyAffiliation = scan.nextLine(); // Get party affiliation input
        if(partyAffiliation.equals("Democrat")) { // If the party affiliation value is "Democrat"
            System.out.println("You get a Democratic Donkey!"); // Tells user they get a Democratic Donkey
        }
        else if(partyAffiliation.equals("Republican")) { // If the party affiliation value is "Republican"
            System.out.println("You get a Republican Elephant!"); // Tells user they get a Republican Elephant
        }
        else if(partyAffiliation.equals("Independent")) { // If the party affiliation value is "Independent"
            System.out.println("You get an Independent Person!"); // Tells user they get an Independent Person
        }
        else { // If the party affiliation is something other than a Democrat, Republican, and Independent
            System.out.println("You get an Other!"); // Tells user they get an Other
        }
    }
}
