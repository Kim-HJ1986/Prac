package variatingParameters;

public class Sumator {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	//이렇게 개발하면 노가다쟁이가 되는거야~!
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	// 파랄미터 갯수 가변 -> ...으로 표현. variant argument(parameter)
	public static int sum(int... a) {
		int sum = 0;
		for(int val : a)
			sum += val;
		return sum;
	}
}
