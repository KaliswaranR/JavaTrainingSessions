package OopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b=new BMW();
		b.start();
		b.theftSafety();
		b.engine();
		
		System.out.println("***************");
		Car c=new Car();
		
		c.refuel();
		c.start();
		c.stop();
		
		System.out.println("***************");
		Car c1=new BMW();
		c1.refuel();
		c1.start();
		c1.stop();
	
		System.out.println("***************");
		
//		BMW b1 = (BMW) new Car();
//
//		b1.refuel();

	}

}
