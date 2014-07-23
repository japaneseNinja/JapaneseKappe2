package sample;

public class Sample{
	public static void main(String[] args) {

		Test test = new TestA();
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
	static void create(Test test) {
		if (test instanceof TestA) {
			TestA testa = (TestA) test;
			testa.method();
		} else {
			TestB testb = (TestB) test;
			testb.method();
		}
	}
}