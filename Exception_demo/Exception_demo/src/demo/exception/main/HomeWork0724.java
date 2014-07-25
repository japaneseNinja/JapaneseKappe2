package demo.exception.main;

import demo.exception.exception.SuzumuraException;

/**
 * 独自エラーのテストコードです。 鈴村が引数としてcheckメソッドに渡されるとExceptionが発生します。
 * 
 * @author SuzumuraMan
 * 
 */
public class HomeWork0724 {
	public static void main(String[] args) {
		String name = "鈴村";
		check(name);
	}

	/**
	 * 鈴村かどうかのチェックを行います。
	 * 
	 * @param name 名前
	 */
	static void check(String name) {
		if ("鈴村".equals(name)) {
			try {
				throw new SuzumuraException("鈴村は通行が禁止されています");
			} catch (SuzumuraException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("通行許可");
		}
	}
}
