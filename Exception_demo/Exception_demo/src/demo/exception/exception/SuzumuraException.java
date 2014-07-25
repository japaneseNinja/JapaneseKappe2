package demo.exception.exception;

/**
 * 鈴村例外のクラスです。
 * 
 * @author pm14
 * 
 */
public class SuzumuraException extends Exception {
	SuzumuraException() {
		System.out.println("鈴村禁止");
	}

	/**
	 * コンストラクター
	 * 
	 * @param message メッセージ
	 */
	public SuzumuraException(String message) {
		super(message);
	}
}
