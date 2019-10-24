package lab1;

public class Member extends Passenger {

	private int yearsOfMembership;
	
	public Member(String name, int age, int yOM) {
		super(name, age);
		this.yearsOfMembership = yOM;
	}

	@Override
	public double applyDiscount(double p) {
		if(yearsOfMembership > 5) {
			return p*0.5;
		}
		else if(yearsOfMembership > 1) {
			return p*0.9;
		}
		return 1;
	}
	
}
