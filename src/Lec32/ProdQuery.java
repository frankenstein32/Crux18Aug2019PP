package Lec32;

public class ProdQuery implements Operations{

	@Override
	public int operation(int val1, int val2) {
		return val1 * val2;
	}

	@Override
	public int defaultVal() {
		return 1;
	}

	
}
