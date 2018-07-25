package pack.sub.main;

import pack.sub.Base1;
import pack.sub.derived.Derived2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 base = new Base1();
		base.pubf=1;
		
		Derived2 derived = new Derived2();
		derived.test2();
		
	}

}
