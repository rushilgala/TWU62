import java.util.ArrayList;

public class PrimeFactors {

	public static ArrayList<Integer> generate(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) list.add(i);
		}
		return list;
	}
}
