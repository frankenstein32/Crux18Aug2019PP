package Lec32;

public class SumQuery implements Operations{

	@Override
	public int operation(int val1, int val2) {
		return val1 + val2;
	}

	@Override
	public int defaultVal() {
		return 0;
	}

	
}
