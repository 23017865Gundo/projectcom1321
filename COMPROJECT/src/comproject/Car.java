/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comproject;


public class Car extends Expense{
	private String _Model;
	private String _Make;
	private double _Deposit;
	private double _intRate;
	private int _Premium;
	
	public Car( String Model,String Make,double purchasePrice, double deposit, double intRate,int prem) {
		super("Car",purchasePrice);
		_Model = Model;
		_Make = Make;
		_Deposit = deposit;
		_intRate =intRate;
		_Premium = prem;
	}
	
	@Override
    public double calculate() {
		double P = _amount - _Deposit;
		int n = 60;
		double num = P*_intRate*Math.pow(1+_intRate,60);
		double den = Math.pow(1+_intRate,60)-1;
		double M = num/den;
		return M + _Premium;
    }

    
}
