import java.awt.*;
import java.util.*;

public class Questions {
	public static void main(String args[]) {
		System.out.println("Enter a name: ");
		Scanner scName = new Scanner(System.in);
		String name = scName.next();
		System.out.println("Enter a place: ");
		Scanner scPlace = new Scanner(System.in);
		String place = scPlace.next();
		System.out.println("Enter an animal: ");
		Scanner scAnimal = new Scanner(System.in);
		String animal = scAnimal.next();
		System.out.println("Enter a thing: ");
		Scanner scThing = new Scanner(System.in);
		String thing = scThing.next();
		
		System.out.println("Here's a story for you: ");
		System.out.println(name + " went to " + place + " to pick up his pet " + animal + " that was eating a " + thing + "!");
	}
}
