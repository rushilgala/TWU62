public class Triangle {

	public void easiest() {
		System.out.println("*");
	}

	public void horizontal(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void vertical(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	public void rightTriangle(int n) {
		for (int i = 0; i < n; i++) {
			horizontal(i+1);
		}
	}
}
