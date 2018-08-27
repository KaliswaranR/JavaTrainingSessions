package OopsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USBank b=new USBank();
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.educationLoan();
		hs.homeLoan();
		hs.transferMoney();
		
		//dynamic polymorphism  - child class object can be referred by parent interface reference variable
		
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		int i= USBank.min_bal;
		System.out.println(i);
		
	}

}
