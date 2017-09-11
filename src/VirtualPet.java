import java.util.Random;

public class VirtualPet {

	Random random = new Random();
	String petName;
	int hunger = 50;
	int thirst = 50;
	int tiredness = 50;
	int training = 1;

	public static String menuPet() {
		return "\nWhat would you like to do?\nPress 1 to Feed your pet.\nPress 2 to Water your pet.\nPress 3 to let your pet Rest.\nPress 4 to Play with you pet.\nPress 5 to do nothing...lame.\nPress 6 to check your pets stats.\nPlease respond: ";
	}

	public String statusPet() {
		return "\n" + petName + "'s current stats are as follows...\nHunger: " + hunger + "\nThirst: " + thirst
				+ "\nTiredness: " + tiredness + "\nEXP: " + training;
	}

	public String choiceOne() {
		return "You feed " + petName + " some food.\n";
	}

	public String choiceTwo() {
		return "You give " + petName + " some water.\n";
	}

	public String choiceThree() {
		return "You lay " + petName + " to rest for a bit.\n";
	}

	public String choiceFour() {
		return "You train with " + petName + ".\n";
	}

	public String choiceFive() {
		return petName + " trudges around a bit, bored.";
	}

	public String notGood() {
		return petName + " has died of starvation...FeelsBadMan";
	}

	public String petStarve() {
		return "\n" + petName + " dies of Dysentery...FeelsBadMan.";
	}

	public String petDehydrate() {
		return petName + " has died of dehydration... FeelsBadMan";
	}

	boolean petIsNotDed() {
		if (hunger > 0 && thirst > 0) {
			return true;
		}
		return false;
	}

	boolean letsPlayAGame() {
		int rando = random.nextInt(50) + 1;
		if (rando == 25) {
			return false;
		} else {
			return true;
		}
	}

	void feed() {
		hunger += 5;
		thirst += 1;
		tiredness -= 1;
	}

	void water() {
		hunger += 1;
		thirst += 5;
		tiredness -= 1;
	}

	void rest() {
		hunger -= 3;
		thirst -= 2;
		tiredness += 7;
	}

	void training() {
		hunger -= 2;
		thirst -= 1;
		tiredness -= 1;
		training += 6;
	}

	void tick() {
		hunger -= 2;
		thirst -= 2;
		tiredness -= 1;
	}
}
