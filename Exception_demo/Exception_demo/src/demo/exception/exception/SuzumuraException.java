package demo.exception.exception;

/**
 * �鑺��O�̃N���X�ł��B
 * 
 * @author pm14
 * 
 */
public class SuzumuraException extends Exception {
	SuzumuraException() {
		System.out.println("�鑺�֎~");
	}

	/**
	 * �R���X�g���N�^�[
	 * 
	 * @param message ���b�Z�[�W
	 */
	public SuzumuraException(String message) {
		super(message);
	}
}
