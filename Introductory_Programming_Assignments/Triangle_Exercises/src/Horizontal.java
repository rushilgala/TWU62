import java.util.Scanner;

public class Horizontal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
}