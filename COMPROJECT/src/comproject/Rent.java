package comproject;

public class Rent extends Expense{

    public Rent( double amount) {
		super("Rent",amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }
}
	
