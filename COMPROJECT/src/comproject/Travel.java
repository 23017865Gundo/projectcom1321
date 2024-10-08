package comproject;

public class Travel extends Expense{

	
	public Travel(double amount) {
		super("Travel",amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }

}
