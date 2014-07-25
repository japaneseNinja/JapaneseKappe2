import java.util.ArrayList;

public class ArrayList_demo_main {
	public static void main(String[] args) {
		LikeList list = new LikeList();
		list.add("鈴村");
		list.get();
		list.add("久保田");
		list.get();
		ArrayList listn = new ArrayList();
	}
}
/*
7/25
Listクラスと同様の機能を持つクラスを作成する
・クラス名　LikeList
・ジェネリクスを使って様々な型に対応させること
<機能>
・最後に挿入
	- boolean add(Objct obj)
・任意のインデックスに挿入
	- boolean add(Object obj, int idx)
・インデックスを指定して削除
	- boolean remove(int idx)
・インデックスを指定して値の取得
	- Object get(int idx)
・リストに指定された値が含まれているかを判断する
	- boolean contains(Object)
	※StringとObjectに対応させる
・要素数の取得
	- int size ※フィールド
・配列に変換
	- Object[] toArray()
・要素のコピー
	- clone()
	- ディープコピーであること
<テスト>
・以下のことが保障されていること
	- String,Integer,独自クラスで上記の機能が使えること
	- remove()メソッドで要素を消した場合、要素数とsizeの値が同じであること
	- clone()ﾒｿｯﾄﾞでコピーしたオブジェクトは元のオブジェクトと参照先
*/
class LikeList {
	int size;
	String obj;
	String[] aray;
	String[] sub;

	boolean add(String obj) {
		this.obj = obj;
		size++;
		aray = new String[size];
		for (int i = 0; i < size - 1; i++) {
			String s = sub[i];
			aray[i] = s;
		}
		sub = new String[size + 1];
		aray[size - 1] = obj;
		for (int i = 0; i < size; i++) {
			String s = aray[i];
			sub[i] = s;
		}
		return true;
	}

	void get() {
		for (String i : aray) {
			System.out.println(i);
		}
		System.out.println("");
	}
}
/*boolean add(T obj,int idx){
this.obj = obj;
}
boolean remove(int idx){

}
Object get(int idx){
}
boolean contains(T){
}
}
}
}
*/