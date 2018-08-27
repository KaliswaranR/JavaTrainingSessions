package OopsConceptPart2;

public class HSBCBank implements USBank,Brazilbank {// we are achieving multiple inheritance
	
	// Is-a relationship
	
	// mandatory define all methods of interface
	
	public void credit() {
		System.out.println("HSBC Credit");
}
	
	public void debit() {
		System.out.println("HSBC Debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC tranferMoney");
	}
	
	public void educationLoan() {
		System.out.println("Separate HSBC Education Loan");
	}
	
	public void homeLoan() {
		System.out.println(" Separate HSBC Homeloan");
	}

	@Override
	public void mutualFunds() {
		// TODO Auto-generated method stub
		System.out.println("Brazilbank mutual funds");
	}

	}
