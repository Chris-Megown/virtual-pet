
public class VirtualPet {

	String petName;
	int hunger = 50;
	int thirst = 50;
	int tiredness = 50;
	int training = 1;

	public static String menuPet() {
		return "\nWhat would you like to do?\nPress 1 to Feed your pet.\nPress 2 to Water your pet.\nPress 3 to let your pet Rest.\nPress 4 to Play with you pet.\nPress 5 to do nothing...lame.\nPlease respond: ";
	}

	public String statusPet() {
		return "\n" + petName + "'s current stats are as follows...\nHunger: " + hunger + "\nThirst: " + thirst
				+ "\nTiredness: " + tiredness + "\nEXP: " + training;
	}

	boolean petIsNotDed() {
		if (hunger > 0 && thirst > 0) {
			return true;
		}
		return false;
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
		hunger -= 5;
		thirst -= 5;
		tiredness -= 1;
	}
}
