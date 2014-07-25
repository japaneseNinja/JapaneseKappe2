public class LikeListTets {
	int size;
	String obj;
	String[] sub = new String[size + 1];
	String[] aray;

	boolean add(String obj) {
		size++;
		sub = aray.clone();
		aray = new String[size];
		
		for (int i = 0; i< sub.length; i++) {
			aray[i] = sub[i];
		}
		aray[sub.length + 1] = obj;

		this.obj = obj;
		aray[size - 1] = obj;
		for (int i = 0; i < size; i++) {
			String s = aray[i];
			sub[i] = s;
		}
		size++;
		return true;
	}

	void get() {
		for (String i : aray) {
			System.out.println(i);
		}
		System.out.println("");
	}
}
//boolean add(T obj,int idx){
//this.obj = obj;
//}
//boolean remove(int idx){

//}
//Object get(int idx){
//}
//boolean contains(T){
//}
//}
//}
//}