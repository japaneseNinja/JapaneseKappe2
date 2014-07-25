package demo.exception.exception;

public class SuzumuraException extends Exception{
		SuzumuraException() {
			System.out.println("鈴村禁止！");
		}
		
		public SuzumuraException(String message) {
			super(message);
		}
	}
