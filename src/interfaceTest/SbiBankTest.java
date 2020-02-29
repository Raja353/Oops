package interfaceTest;

public class SbiBankTest implements RbiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//RbiTest r = new RbiTest(); we can't create a object for interface
	SbiBankTest s = new SbiBankTest();
s.credit();
s.debit();
s.loan();
s.homeloan();
RbiTest r = new SbiBankTest();
r.credit();
r.debit();
r.loan();
//r.homeloan(); is not possible
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("SBI implemented its own debit logic");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
System.out.println("SBI implemented its own loan logic");		
	}


	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("SBI implemented its own credit logic");
	}
	public void homeloan(){
		System.out.println("SBI implemented its own home loan logic");
	}

}
