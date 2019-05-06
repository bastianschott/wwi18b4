package funktProgrammierung.test;

import java.util.*;

public class Test {
	int i;

	Test(int i) {
		this.i = i;
	}

	boolean istGerade() {
		return i%2==0;
	}
	
	int getI() {
		return ++i;
	}
	
	static void go() {
		
	}
	
	@Override
	public String toString() {
		return i+"";
	}

	public static void main(String[] args) {
		List<Test> test = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			test.add(new Test((int) (Math.random() * 100)));
		}
		Runnable r = () -> go();
		test.stream().filter(Test::istGerade).map(Test::getI).forEach(System.out::println);;;
		
	}
}