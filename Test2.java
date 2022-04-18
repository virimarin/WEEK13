
public class Test2 {
	public static void main(String[] args) {
		A a = new A();
		a.p(10.0);
		a.p(10);
	}
}

class D {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class E extends D {
	// This method overrides the method in B
	public void p(double i) {
		System.out.println(i);
	}
}
