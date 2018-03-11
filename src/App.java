
public class App {

	public static void main(String[] args) {

		System.out.println(sum(0));
		System.out.println(sum(1));
		System.out.println(sum(2));
		System.out.println(sum(3));
		System.out.println(sum(4));
		System.out.println(sum(5));
		System.out.println("Adding code");
		System.out.println("Adding code from GitHub");
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (sum(n - 1) + n);
	}
}
