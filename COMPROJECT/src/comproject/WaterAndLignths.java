package comproject;

public class WaterAndLignths extends Expense{

	
	public WaterAndLignths(double amount) {
		super("Water and Lights",amount);
	}
	@Override
    public double calculate() {
        return _amount;
    }

}
