package comproject;

public class cellPhones extends Expense{

	
	public cellPhones(double amount) {
		super("cell Phones",amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }


}

