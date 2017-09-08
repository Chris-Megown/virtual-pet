
public class VirtualPet {

	String petName;
	int hunger = 50;
	int thirst = 50;
	int tiredness = 50;
	int boredom = 50;

	public static String menuPet() {
		return "\nPress 1 to Feed your pet.\nPress 2 to Water your pet.\nPress 3 to let your pet Rest.\nPress 4 to Play with you pet.\nPress 5 to do nothing.\nPlease respond: ";
	}

	public String statusPet() {
		return petName + "'s current stats are as follows...\nHunger: " + hunger + "\nThirst: " + thirst
				+ "\nTiredness: " + tiredness + "\nBoredom: " + boredom;
	}

	boolean PetIsNotDed() {
		if (hunger > 0 && thirst > 0 && tiredness > 0) {
			return true;
		}
		return false;
	}

	void feed() {
		hunger += 5;
		thirst += 1;
		tiredness -= 1;
		boredom -= 2;
	}

	void water() {
		hunger += 5;
		thirst += 1;
		tiredness -= 1;
		boredom -= 2;
	}

	void rest() {
		hunger -= 3;
		thirst -= 3;
		tiredness += 7;
		boredom += 2;
	}

	void boredom() {
		hunger -= 1;
		thirst -= 1;
		tiredness -= 1;
		boredom += 6;
	}

	void tick() {
		hunger -= 5;
		thirst -= 5;
		tiredness -= 1;
		boredom -= 2;
	}
}
