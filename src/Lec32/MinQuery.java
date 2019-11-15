package Lec32;

public class MinQuery implements Operations {

	@Override
	public int operation(int val1, int val2) {
		return Math.min(val1, val2);
	}

	@Override
	public int defaultVal() {
		return Integer.MAX_VALUE;
	}

}
