package comparable;

public class Person implements Comparable{
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {   //비교 가능하게 만들어줌
		if (!(o instanceof Person)) {
			return -1;
		}
		Person p = (Person) o;
		
		return name.compareTo(p.name);
	}

}
