package comproject;

public abstract class Expense {
	protected String _description;
	protected double _amount;

	public Expense(String description, double amount) {
		_description =description;
		_amount = amount;
	}

	public double getAmount() {
		return _amount;
	}
	public String getDescription() {
		return _description;
	}
	public abstract double calculate();
}
