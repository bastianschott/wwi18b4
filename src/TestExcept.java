public class TestExcept {
	public static void main(String[] args) {
		int j = 1;
		try {
			int i = schlussJetzt() / (j = 2);
		} catch (Exception e) {
			System.out.print(e);
			System.out.println(" j = " + j);
		}
		int divisor = 0;
		try {
			int i = 1 / (divisor * nixMehr());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static int schlussJetzt() throws Exception {
		throw new Exception("Schluss jetzt!");
	}

	static int nixMehr() throws Exception {
		throw new Exception("Nichts geht mehr!");
	}
}