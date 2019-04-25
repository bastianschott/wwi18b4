
public class TestReturnBreak {
	public static void main(String[] args) {
		int i=0;
		while(true) {
			i++;
			System.out.println(i);
			if(i==4) break;
			if(i==5) return;
		}
		System.out.println("Stop");
	}
}
