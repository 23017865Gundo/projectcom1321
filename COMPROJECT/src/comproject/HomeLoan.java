package comproject;

public class HomeLoan extends Expense{
	
	private double _Deposit;
	private double _intRate;
	private int _numMonths;
	
	public HomeLoan( double purchasePrice, double deposit, double intRate,int numMonths) {
		super("HomeLoan",purchasePrice);
		_Deposit = deposit;
		_intRate =intRate;
		_numMonths = numMonths;
	}
	
	@Override
    public double calculate() {
        double P = _amount- _Deposit;
        int n = _numMonths/12;
        double A = P*(1+_intRate*n);
        return A/_numMonths;
    }

}

