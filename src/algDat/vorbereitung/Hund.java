package algDat.vorbereitung;

class Maus {
	Maus() {
		System.out.println("Maus");
	}
}

class Katze {
	Katze() {
		System.out.println("Katze");
	}

	Katze(String name) {
		System.out.println("Katze " + name);
	}
}

class Tiger extends Katze {
	Katze k = new Katze("Spot");

	Tiger() {
		System.out.println("Tiger");
	}
}

class Hund extends Tiger {
	Katze m = new Katze("Tom");
	static Maus r = new Maus();

	Hund() {
		System.out.println("Hund");
	}

	public static void main(String[] args) {
		new Hund();
	}
}
