package algDat.blatt05;

public class ListeLMain {
	public static void main(String[] args) {
		ListeL<Integer> list = new ListeL<Integer>();
		
		list.insert(5);
		list.insert(9);
		list.insert(7);
		list.insert(14);
		list.insert(2);
		list.insert(84);
		list.insert(9);
		list.insert(27);
		
		if(list.find1(2) == 3) {
			System.out.println("TestFind1:\tOK");
		} else System.out.println("TestFind1:\tERROR");

	}
}
