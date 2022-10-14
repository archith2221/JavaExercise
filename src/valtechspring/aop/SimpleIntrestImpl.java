package valtechspring.aop;

public class SimpleIntrestImpl implements SimpleInterest {
	
	private Arithmetic arithmetic;
	
	
	
	public SimpleIntrestImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SimpleIntrestImpl(Arithmetic arithmetic) {
		super();
		this.arithmetic = arithmetic;
	}

	public void setArithmetic(Arithmetic arithmetic) {
		this.arithmetic = arithmetic;
		
	}
	
	
	@Override
	public int computeSimpleInterest(int principal,int time,int rateofInterest){
		return arithmetic.div(arithmetic.mul(principal,time,rateofInterest),100);
	}

	
	   
}
