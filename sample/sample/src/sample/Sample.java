package sample;

public class Sample{
	int x = 5;
	public static void main(String[] args) {

		Object test = new TestA();
		Factory.create(test);
	}
}

class TestA{
	void method() {
		System.out.println("A");
	}
}

class TestB{
	void method() {
		System.out.println("B");
	}
}

class Factory {
	static void create(Object test) {
		if (test instanceof TestA) {
			TestA testa = (TestA) test;
			testa.method();
		} else {
			TestB testb = (TestB) test;
			testb.method();
		}
	}
}