package assingment5;

public class AxisBank extends BankInfo  {
	public void deposit() {
		System.out.println("the deposited amout is 50000");
		}
	public static void main(String[] args) {
		AxisBank axisObject = new AxisBank();
		axisObject.deposit();
	}
}
//You have to override the method deposit in AxisBank.