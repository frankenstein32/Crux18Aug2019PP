package Lec32;

public class MaxQuery implements Operations{

	@Override
	public int operation(int val1, int val2) {
		return Math.max(val1, val2);
	}

	@Override
	public int defaultVal() {
		return Integer.MIN_VALUE;
	}

	
}
