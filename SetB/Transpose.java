package SetB;

class Transpose {
	static final int N = 3;

	// This function stores transpose
	// of A[][] in B[][]
	static void transpose(int A[][], int B[][]) {
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];
	}

	// Driver code
	public static void main(String[] args) {
		int A[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int B[][] = new int[N][N], i, j;
		// Function call
		transpose(A, B);
		System.out.println("Result matrix is ");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++)
				System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}
