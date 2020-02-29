package polyTest;

public class ChildOverrideTest extends ParentOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildOverrideTest c= new ChildOverrideTest();
c.exe();
		//add();
	}
	public static void add(){
		System.out.println("i am child add");
	}
    public void exe(){
    	super.add();// not allowed in static
    	add();
    	this.add();// not allowed in static
    			
    }
}
