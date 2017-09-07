
public class VirtualPet {

	public static String menuPet() {
		return "Press 1 to Feed your pet.\nPress 2 to Water your pet.\nPress 3 to let your pet Rest.\nPress 4 to Play with you pet.\nPress 5 to do nothing.\nPlease respond: ";
	}

	int hunger = 50;
	int thirst = 50;
	int tiredness = 50;

	void feed(int amount) {
		hunger += amount;
	}

	void water(int amount) {
		thirst += amount;
	}

	void rest(int amount) {
		tiredness += amount;
	}
}
