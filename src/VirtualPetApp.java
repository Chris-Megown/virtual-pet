import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet uberPet = new VirtualPet();
		System.out.println("Welcome to Virtual Petworld 2.0");

		for (int tick = 0; tick < 10; tick++) {
			String userChoice;

			do {
				System.out.println(VirtualPet.menuPet());
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4"));

			switch (userChoice) {
			case "1":
				System.out.println("\nYou feed your pet");
				uberPet.feed(5);
				System.out.println("Your pets Hunger is at: " + uberPet.hunger);
				break;
			case "2":
				System.out.println("\nYou give you pet water");
				uberPet.water(5);
				System.out.println("Your pets Thirst is at: " + uberPet.thirst);
				break;
			case "3":
				System.out.println("\nYour pets  is " +);
				break;
			case "4":
				System.out.println("\nThank you, have a stupendous day!");
				System.exit(0);
			}

		}
	}

}
