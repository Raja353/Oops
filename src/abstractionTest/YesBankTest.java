package abstractionTest;

public class YesBankTest extends RbiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
loan();
//RbiTest r = new Rbitest(); object creation not possible
YesBankTest y = new YesBankTest();
y.credit();
y.debit();
RbiTest r = new YesBankTest();
r.credit();
r.debit();
	}
	

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("YesBank debit implemented");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
	System.out.println("YesBank credit implemented");	
	}

}
