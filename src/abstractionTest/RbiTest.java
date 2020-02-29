package abstractionTest;

public abstract class RbiTest {
	//looks like interface
	public abstract void credit();

	public abstract void debit();
//looks like inheritance
	public static void loan() {
		System.out.println("loan logic implemented");
	}
}
