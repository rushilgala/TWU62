import java.util.Scanner;
public class Diamond_Name {
	public static void main(String[] args) {
		String name = "Rushil";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		// Do n-1
		for (int i = 0; i < n-1; i++) {
			for (int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(name);
		// Start working backwards from n-1 to 0
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
}
