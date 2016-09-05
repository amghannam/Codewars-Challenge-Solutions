/*
* Given two integers, which can be positive and negative, find the sum of all the numbers between 
* including them too and return it. If both numbers are equal, return a or b. Note that a and b are not ordered!
*/

public class Sum {
	public int getSum(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int result = 0;
		for (int i = min; i <= max; i++) {
			result += i;
		}
		return result;
	}
}
