package softwareEngineering1.se1_blatt03;

import Prog1Tools.IOTools;

public class Fib {

	static int fib(int n) {
		int f = 0;
		int fMinus1 = 1;
		int fMinus2 = -1;

		while (n > 1) {
			n--;
			fMinus2 = fMinus1;
			fMinus1 = f;
			f = fMinus1 + fMinus2;
		}
		return f;
	}

	public static final void main(final String[] args) {
		int n = IOTools.readInt("Nte Fibonacci-Zahl f_N berechnen, N = ");
		System.out.println("f_" + 10 + " = " + fib(n));
	}
}