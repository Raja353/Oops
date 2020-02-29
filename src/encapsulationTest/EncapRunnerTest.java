package encapsulationTest;
//(private)raping of method & variable together to used from one class to another class with help of getter and setter = encapsulation 
public class EncapRunnerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
EncapsulateTest e = new EncapsulateTest();
//like gpay
e.setAccountNumber(123456);
System.out.println(e.getAccountNumber()+ "this exists");
	e.setName("ABC");
	System.out.println(e.getName()+" name exists");
	}
}

// Iteratable
// Collection
//1. list(I)  (1.array list(c)  2. linked List(c) )
//2. (duplicate removable component)set(I) (1. hash set(random)(c)  2. Tree Set(ascending order)(c) 3. linked set(inserting order) (c))
// hash set 1.7 random
//hash set 1.8 ascending
//tree set null not allowed
//3. Hash Table(c)(fastest data)
//4.MAP(I) (1.Hash 2. tree 3. linked) similiar to set
