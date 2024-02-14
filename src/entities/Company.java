package entities;

public class Company extends Payers {
	private int numFunc;
	
	public Company () {
		
	}

	public Company(String name, Double amount, int numFunc) {
		super(name, amount);
		this.numFunc = numFunc;
	}
	
	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public Double taxes() {
		
		if(numFunc <= 10) {
			return getAmount() * 0.16;
			
		}
		else {
			return getAmount() * 0.14;
		}
	}
	
}
