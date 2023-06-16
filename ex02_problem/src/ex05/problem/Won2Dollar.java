package ex05.problem;

public class Won2Dollar extends Converter{
	

	public Won2Dollar(int ratio) {
		super.ratio = ratio; 
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() {		
		return "원화";
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
