package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class PrintBySort {

	public static void main(String[] args) {
		Collection<Person> l = new TreeSet<>();
		l.add(new Person(1, "홍"));
		l.add(new Person(2, "박"));
		l.add(new Person(3, "김"));
		
		for (Person i : l) {
			System.out.print(i + " ");
			
		/**Collection<Integer> l = new TreeSet<>(); //TreeSet에는 sort 정렬 기능이 들어있음
		//Collection<Integer> l = new ArrayList<>(); // ArrayList에는 정렬기능은 없음
		
		//l.add(5);l.add(7);l.add(2);l.add(1);l.add(9);l.add(3);
		
		for (Integer i : l) {
			//System.out.print(i + " "); */
		}

	}

}
