
public class App2 {

	public static void main(String[] args) {

		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(2));
		System.out.println(fact(3));
		System.out.println(fact(4));
		System.out.println(fact(5));
		
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		}
		return (fact(n - 1)*n);
	}
}
	
