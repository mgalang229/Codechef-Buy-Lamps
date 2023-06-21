import java.util.Scanner;


//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), k = fs.nextInt(), x = fs.nextInt(), y = fs.nextInt();
			n -= k;
			System.out.println(x * k + n * Math.min(x, y));
		}
		fs.close();
	}
}
