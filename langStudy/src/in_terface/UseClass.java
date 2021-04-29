package in_terface;

import java.util.LinkedList;
import java.util.List;

import in_terface.provider.B;

public class UseClass {
	
	public static void main(String[] args) {
		List<String> l = new LinkedList<>();  //딱 붙어있는 애들이라 추가하고 빼는것 자주 못함
		//List<Integer> p = new LinkedList<>();
		l.add("A");
		
		IMyInterface a = new B();
		a.a();
	}
}
