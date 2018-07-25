package pack.sub.derived;

public class Derived2 extends Derived1 {
	
	public Derived2() {
		super();
	}
	public void test2() {
		super.pubf = 3;
		super.base1();
	}
}
