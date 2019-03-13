
public class RunIntervalle {
	public static void main(String[] args) {
		Intervall2D m = new Intervall2D(new Intervall(1,3), new Intervall(3,8));
		System.out.println(m);
		System.out.println(m.area());
		m.move(4, 1);
		System.out.println(m.area());
	}
}
