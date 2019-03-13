
public class TestException {

	public static void main(String[] args) {
		int[] i = new int[1];
		
		try {
			i[2] = 3;
			i[0] = 4/0;
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
