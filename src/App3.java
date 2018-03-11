
public class App3 {

	public static void main(String[] args) {

		Integer[] numbers = { 7, 2, 3, 1, 5, 15 };

		System.out.println(maxValue(numbers));
		System.out.println(minValue(numbers));
		System.out.println(avgValue(numbers));
	}

	private static int maxValue(Integer[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	private static int minValue(Integer[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	private static double avgValue(Integer[] numbers) {  
	    int sum = 0;
	    double avg;

	    for(int i=0; i < numbers.length; i++){
	        sum = sum + numbers[i];
	    }
	    avg = (double)sum/numbers.length;
	    return avg;    
	}
}