import java.util.ArrayList;
import java.util.Scanner;
public class Prime_Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> list = generate(n);
		System.out.println(list.toString());
	}

	private static ArrayList<Integer> generate(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) list.add(i);
		}
		return list;
	}
}
