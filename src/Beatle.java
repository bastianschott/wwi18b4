class Paul {
	Paul() {
		System.out.println("Paul");
	}
}

class John {
	John() {
		System.out.println("John");
	}
}

class George extends Paul {
	static John h = new John();

	George() {
		System.out.println("George");
	}
}

class Ringo extends George {
	static Paul p = new Paul();

	Ringo() {
		System.out.println("Ringo");
	}
}

public class Beatle extends Ringo {
	John h = new John();

	Beatle() {
		System.out.println("Beatle");
	}

	public static void main(String[] args) {
		new Beatle();
	}
	
	/*
	 * Paul 
	 * George 
	 * Ringo 
	 * John 
	 * Beatle
	 */
}
