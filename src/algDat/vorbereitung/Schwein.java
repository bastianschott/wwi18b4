package algDat.vorbereitung;

class Vogel {
	Vogel() {
		System.out.println("Vogel");
	}
}

class Dino {
	Vogel v;

	Dino(String name) {
		System.out.println("Dino " + name);
	}

	public String toString() {
		return " OTTO ";
	}
}

class Reh extends Dino {
	Schwein r = new Schwein();
	Dino k = new Dino("Susi");

	Reh() {
		super("Rudi");
		System.out.println("Reh");
	}
}

class Schwein extends Reh {
	Dino m = new Dino("Tim");

	Schwein() {
		System.out.println("Schwein" + new Dino("Maria") + v + m);
	}

	public static void main(String[] args) {
		new Schwein();
	}
}
