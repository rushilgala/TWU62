public class Diamond {

	public void isocelesTriangle(int n) {
		triangle(n, n);
	}

	public void centeredDiamond(int n) {
		isocelesTriangle(n);

		reverseTriangle(n);
	}

	public void diamondWithName(int n, String name) {

		triangle(n-1,n);
		System.out.println(name);
		reverseTriangle(n);
	}

	public void reverseTriangle(int n) {
		for (int i = n-2; i>=0; i--) {
			for (int j=i; j<n-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void triangle(int numOfLines, int numOfSpaces) {
		for (int i = 0; i < numOfLines; i++) {
			for (int j=numOfSpaces-1; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
