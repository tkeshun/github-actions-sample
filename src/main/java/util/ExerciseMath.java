package util;

public class ExerciseMath {
	public static int factorial(int n) {
		int minValue = 0;
		if (n <= minValue) {
			throw new IllegalArgumentException("0以下の値は不正です。");
		}

		int maxValue = 13;
		if (maxValue <= n) {
			throw new IllegalArgumentException("13以上の値は不正です。");
		}

		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		return answer;
	}
}
