package demo.exception.main;
import demo.exception.exception.SuzumuraException;
public class HomeWork0724 {
public static void main(String[] args) {
	String name = "鈴村";
	KappeStopper stop = new KappeStopper();
	stop.check(name);

}
}

class KappeStopper{
	void check(String name){
		if("鈴村".equals(name)){
			try {
				throw  new SuzumuraException("鈴村は通行が禁止されています");
			} catch (SuzumuraException e) {
				e.printStackTrace();
			}
				}
		else{
			System.out.println("通行許可");
			}
	}
}
