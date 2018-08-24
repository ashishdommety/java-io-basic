
/* 
  Import the java.util.Scanner (or java.util.* for 'all') pacakge to allow the program to use Scanner 
*/
import java.util.*; 

public class Questions {
	public static void main(String args[]) {
		
// Ask user to enter a name and store the input
		System.out.println("Enter a name: ");
		Scanner scName = new Scanner(System.in);
		String name = scName.next();
		
// Ask user to enter a place and store the input
		System.out.println("Enter a place: ");
		Scanner scPlace = new Scanner(System.in);
		String place = scPlace.next();
		
// Ask user to name an animal and store the input
		System.out.println("Enter an animal: ");
		Scanner scAnimal = new Scanner(System.in);
		String animal = scAnimal.next();
		
// Ask user to enter a thing and store the input
		System.out.println("Enter a thing: ");
		Scanner scThing = new Scanner(System.in);
		String thing = scThing.next();

// Output a story based on the users input
		System.out.println("Here's a story for you: ");
		System.out.println(name + " went to " + place + " to pick up his pet " + animal + " that was eating a " + thing + "!");
	}
}
