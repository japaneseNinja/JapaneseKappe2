import java.io.Serializable;

public class RollNumber implements Serializable{
	/**
	 * rollcolとrollCountに任意の数字を入力すると渦巻状に数が表示できます。
	 * 
	 * @param suzumura
	 */

	public static void main(String[] args) {

		int rollcol = 5; // 行数
		int rollCount = 5;
		int rollSubCount = rollCount * 2 - 1;
		int indexH = 0;
		int indexV = 0;
		int masterCount = 1;

		int[][] rollArray = new int[rollcol][rollcol];

		for (masterCount = 1; masterCount <= rollcol; masterCount++) {
			rollArray[indexV][indexH] = masterCount;
			indexH++;
		}
		rollSubCount--;
		rollCount--;
		indexH--;
		for (int i = 0; i < rollcol - 1; i++) { // 全列処理
			for (int j = 0; j < 2; j++) { // 2列をSubCountで1セット処理
				for (int l = 0; l < rollCount; l++) { // 1列の文字を配列に挿入
					if (rollcol % 2 == 1 && rollCount % 2 == 0 && rollSubCount % 2 == 0) { // V軸++に切り替え
						++indexV;
					} else if (rollcol % 2 == 0 && rollCount % 2 == 0 && rollSubCount % 2 == 0) {
						--indexV;
					} else if (rollcol % 2 == 1 && rollCount % 2 == 1 && rollSubCount % 2 == 0) {
						--indexV;
					} else if (rollcol % 2 == 1 && rollCount % 2 == 0 && rollSubCount % 2 == 1) {
						--indexH;
					} else if (rollcol % 2 == 0 && rollCount % 2 == 1 && rollSubCount % 2 == 1) {
						--indexH;
					} else if (rollcol % 2 == 0 && rollCount % 2 == 0 && rollSubCount % 2 == 1) {
						++indexH;
					} else if (rollcol % 2 == 0 && rollCount % 2 == 1 && rollSubCount % 2 == 0) {
						++indexV;
					} else if (rollcol % 2 == 1 && rollCount % 2 == 1 && rollSubCount % 2 == 1) {
						++indexH;
					}
					rollArray[indexV][indexH] = masterCount;
					masterCount++;
				}
				rollSubCount--;
			}
			rollCount--;
		}
		for (int[] n : rollArray) {
			for (int k : n) {
				System.out.printf("%4d", k);
			}
			System.out.println(" ");
		}
	}
}