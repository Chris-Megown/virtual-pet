import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet uberPet = new VirtualPet();
		System.out.println("Welcome to Virtual Petworld 2.0");
		System.out.print("Please name your pet: ");
		uberPet.petName = input.next();
		uberPet.petName = uberPet.petName.substring(0, 1).toUpperCase() + uberPet.petName.substring(1).toLowerCase();

		String userChoice;
		while (uberPet.petIsNotDed() == true) {
			do {
				System.out.println(uberPet.statusPet());
				System.out.println(VirtualPet.menuPet());
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4"));

			switch (userChoice) {
			case "1":
				System.out.println("You feed " + uberPet.petName + " some food.");
				uberPet.feed();
				uberPet.tick();
				System.out.println("Your pets Hunger is at: " + uberPet.hunger);
				break;
			case "2":
				System.out.println("You give " + uberPet.petName + " some water.");
				uberPet.water();
				uberPet.tick();
				System.out.println("Your pets Thirst is at: " + uberPet.thirst);
				break;
			case "3":
				System.out.println("You lay " + uberPet.petName + " to rest for a bit.");
				uberPet.rest();
				uberPet.tick();
				System.out.println("Your pets tiredness is " + uberPet.tiredness);
				break;
			case "4":
				System.out.println("You play fetch with " + uberPet.petName + ".");
				uberPet.training();
				uberPet.tick();
				System.out.println("Your pets boredom is: " + uberPet.training);
				break;
			case "5":
				System.out.println(uberPet.petName + " trudges around a bit, bored.");
			}

		}
		while (!uberPet.petIsNotDed() == true) {
			if (uberPet.hunger <= 0) {
				System.out.println(uberPet.petName + " had died of starvation...FeelsBadMan");
				break;
			} else {
				System.out.println(uberPet.petName + " has died of dehydration... FeelsBadMan");
				break;
			}
		}
		input.close();
	}

}
