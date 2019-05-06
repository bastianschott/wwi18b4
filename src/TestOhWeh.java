public class TestOhWeh {
	public static double server = 9.9;
	public double client = 10.01;

	public static void main(String[] args) {
		Weh q = new Weh();

		// Weh.monitor = 22.22; // | | |
		// Weh.brennen(webcam); // | | |
		q.maus = 22.22; // | | |
		// Oh.tastatur = 22.22; // | | |
		server = 22.22; // | | |
		// Oh.cdrom = 22.22; // | | |
		q.lesen(); // | | |
		// q.lesen(server); // | | |
		// q.brennen(new TestOhWeh().maus); // | | |
		// q.platte = 22.22; // | | |
		q.diskette = 22.22; // | | |
		// Weh.brenner = 22.22; // | | |

	}
}