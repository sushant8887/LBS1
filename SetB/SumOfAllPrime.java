package SetB;

public class SumOfAllPrime {

	static boolean checkPrime(int numberToCheck) {
		if (numberToCheck == 1) {
			return false;
		}
		for (int i = 2; i * i <= numberToCheck; i++) {
			if (numberToCheck % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int primeSum(int l, int r) {
		int sum = 0;
		for (int i = r; i >= l; i--) {

			boolean isPrime = checkPrime(i);
			if (isPrime) {

				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int l = 4, r = 13;

		System.out.println(primeSum(l, r));
	}
}
