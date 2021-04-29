package annotation;

import java.util.ArrayList;
import java.util.List;

public class Person {
	@DisplayCaption(caption = "이름")
	public String name;
	@DisplayCaption(caption = "생일")
	public int birthYear;
	
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public static void main(String[] args) throws Exception {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 1500));
		list.add(new Person("이순신", 1700));
		
		/**
		 * 이름              생일
		 * 홍길동             1500
		 * 이순신             1700
		 */
		
		StringBuilder sb = new StringBuilder();
		//Person 클래스에 정의된 name이라는 속성에 붙여진 DisplayCaption의 caption정보를 가져오자
		// .은 ~야 혹은 ~의, ~에 정도로 해석하면 된다.
		sb.append(Person.class.getDeclaredField("name").getAnnotation(DisplayCaption.class).caption())
		.append('\t')
		.append(Person.class.getDeclaredField("name").getAnnotation(DisplayCaption.class).caption())
		.append("\n");
		for (Person per : list) {
			sb.append(per.name)
			.append('\t')
			.append(per.birthYear)
			.append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
