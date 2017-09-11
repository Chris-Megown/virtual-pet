import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet uberPet = new VirtualPet();
		System.out.println(uberPet.intro());
		uberPet.petName = input.next();
		uberPet.petName = uberPet.petName.substring(0, 1).toUpperCase() + uberPet.petName.substring(1).toLowerCase();
		System.out.println(uberPet.directions());
		System.out.println(uberPet.statusPet());

		String userChoice;
		while (uberPet.petIsNotDed() == true) {
			do {
				System.out.println(VirtualPet.menuPet());
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6"));

			switch (userChoice) {
			case "1":
				System.out.println(uberPet.choiceOne());
				uberPet.feed();
				uberPet.tick();
				System.out.println(uberPet.choiceOneUpdate());
				break;
			case "2":
				System.out.println(uberPet.choiceTwo());
				uberPet.water();
				uberPet.tick();
				System.out.println(uberPet.choiceTwoUpdate());
				break;
			case "3":
				System.out.println(uberPet.choiceThree());
				uberPet.rest();
				uberPet.tick();
				System.out.println(uberPet.choiceThreeUpdate());
				break;
			case "4":
				System.out.println(uberPet.choiceFour());
				uberPet.fetch();
				uberPet.tick();
				System.out.println(uberPet.choiceFourUpdate());
				break;
			case "5":
				System.out.println(uberPet.choiceFive());
				uberPet.tick();
				uberPet.letsPlayAGame();
				if (!uberPet.letsPlayAGame() == true) {
					System.out.println(uberPet.notGood());
					System.exit(0);
				}
				break;
			case "6":
				System.out.println(uberPet.statusPet());

			}

		}
		while (!uberPet.petIsNotDed() == true) {
			if (uberPet.hunger <= 0) {
				System.out.println(uberPet.petStarve());
				break;
			} else {
				System.out.println(uberPet.petDehydrate());
				break;
			}
		}
		input.close();
	}

}
