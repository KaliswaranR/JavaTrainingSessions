package OopsConceptPart2;

public interface USBank {
	
	int min_bal=1000;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body, only method template
	//can declare variables but values can't be changed, static in nature
	//no static methods in interface
	//no main method
	//can't create objects of interface
	//abstract in nature - can't instantiate (USBank u=new USBank();)
	//Interface is multiple inheritance
	

}
