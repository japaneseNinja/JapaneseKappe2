package demo.exception.main;

import demo.exception.exception.SuzumuraException;

/**
 * �Ǝ��G���[�̃e�X�g�R�[�h�ł��B �鑺�������Ƃ���check���\�b�h�ɓn������Exception���������܂��B
 * 
 * @author SuzumuraMan
 * 
 */
public class HomeWork0724 {
	public static void main(String[] args) {
		String name = "�鑺";
		check(name);
	}

	/**
	 * �鑺���ǂ����̃`�F�b�N���s���܂��B
	 * 
	 * @param name ���O
	 */
	static void check(String name) {
		if ("�鑺".equals(name)) {
			try {
				throw new SuzumuraException("�鑺�͒ʍs���֎~����Ă��܂�");
			} catch (SuzumuraException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ʍs����");
		}
	}
}
