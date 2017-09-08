import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet uberPet = new VirtualPet();
		System.out.println("Welcome to Virtual Petworld 2.0");
		System.out.print("Please name your pet: ");
		uberPet.petName = input.next();

		String userChoice;
		while (uberPet.PetIsNotDed() == true) {
			do {
				System.out.println(uberPet.statusPet());
				System.out.println(VirtualPet.menuPet());
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4"));

			switch (userChoice) {
			case "1":
				System.out.println("\nYou feed " + uberPet.petName + " some food.");
				uberPet.feed();
				uberPet.tick();
				System.out.println("Your pets Hunger is at: " + uberPet.hunger);
				break;
			case "2":
				System.out.println("\nYou give " + uberPet.petName + " some water.");
				uberPet.water();
				uberPet.tick();
				System.out.println("Your pets Thirst is at: " + uberPet.thirst);
				break;
			case "3":
				System.out.println("You lay " + uberPet.petName + " to rest for a bit.");
				uberPet.rest();
				uberPet.tick();
				System.out.println("\nYour pets tiredness is " + uberPet.tiredness);
				break;
			case "4":
				System.out.println("You play fetch with " + uberPet.petName + ".");
				uberPet.boredom();
				uberPet.tick();
				System.out.println("\nYour pets boredom is: " + uberPet.boredom);
				break;
			}

		}
		input.close();
	}

}
