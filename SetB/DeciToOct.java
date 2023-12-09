package SetB;

import java.io.*;

class DeciToOct {

	static void decToOctal(int n) {

		int[] octalNum = new int[100];

		int i = 0;
		while (n != 0) {

			octalNum[i] = n % 8;
			n = n / 8;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(octalNum[j]);
	}

	public static void main(String[] args) {
		int n = 33;

		decToOctal(n);
	}
}
