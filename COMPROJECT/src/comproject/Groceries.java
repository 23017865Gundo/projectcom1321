package comproject;

public class Groceries extends Expense{

	
	public Groceries(double amount) {
		super("Groceries",amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }

}