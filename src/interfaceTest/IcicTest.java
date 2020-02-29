package interfaceTest;

public class IcicTest implements RbiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IcicTest i = new IcicTest();
i.credit();
i.debit();
i.loan();
RbiTest r = new IcicTest();
r.credit();
r.debit();
r.loan();
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("ICIC implemented its own credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("ICIC implemented its own debit");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("ICIC implemented its owm loan");
	}

}
