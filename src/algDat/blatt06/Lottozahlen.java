package algDat.blatt06;

import java.util.HashSet;

public class Lottozahlen {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size()!=7) {
			set.add((int)(Math.random()*49)+1);
		}
		
		System.out.println(set.toString());
	}
}
