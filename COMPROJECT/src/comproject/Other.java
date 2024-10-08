package comproject;

public class Other extends Expense {

	public Other(double amount) {
		super("Other Expense", amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }
}
