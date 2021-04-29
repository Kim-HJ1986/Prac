package using_ObjectClass;

import java.util.HashSet;
import java.util.Set;

public class ChildClass extends SClass {
	private String name;
	
	@Override
	public int hashCode() {
		return 3;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildClass other = (ChildClass) obj;
		return true;
	}



	public static void main(String[] args) {
		Set<ChildClass> mySet = new HashSet<>();
		
		ChildClass c1 = new ChildClass();
		ChildClass c2 = new ChildClass();
		ChildClass c3 = new ChildClass();
		
		mySet.add(c1);
		mySet.add(c2);
		mySet.add(c3);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(mySet.size());
	}
}
