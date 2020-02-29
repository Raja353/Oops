package encapsulationTest;

public class EncapsulateTest {
private int accountnumber;
private String name;
public void setAccountNumber(int accountnumber){
	this.accountnumber = accountnumber;
}
public int getAccountNumber() throws InterruptedException{
	System.out.println("Please wait Verifying your account number");
	Thread.sleep(3000);
	return accountnumber;
	
}
public void setName(String name){
	this.name = name;
}
public String getName(){
	System.out.println("please wait verifying your user name");
return name;

}
}
