import java.util.Scanner;
public class Isosceles_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
