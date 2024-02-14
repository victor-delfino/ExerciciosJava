package entities;

public abstract class Payers {
	private String name;
	protected Double amount;
	
	public Payers () {
		
	}

	public Payers(String name, Double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public abstract Double taxes();
}
