package entities;

public class Individual extends Payers {
	private Double spendHealth;
	
	public Individual () {
		
	}

	public Individual(String name, Double amount, Double spendHealth) {
		super(name, amount);
		this.spendHealth = spendHealth;
	}

	public Double getSpendHealth() {
		return spendHealth;
	}

	public void setSpendHealth(Double spendHealth) {
		this.spendHealth = spendHealth;
	}

	@Override
	public Double taxes() {
		if(getAmount() <= 20000) {
			return getAmount() * 0.15 - spendHealth * 0.5;
		 
		} 
		else {
			return getAmount() * 0.25 - spendHealth * 0.5;
		
		}
	}
}