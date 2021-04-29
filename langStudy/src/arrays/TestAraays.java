package arrays;

import java.util.Arrays;

public class TestAraays implements Comparable<TestAraays> { // Comparable은 오버라이드 해줘야함 우클릭 리팩터 오버라이드!
													//이때 Comparable 뒤에 <참조자료형 이름>써주면 오버라이드 더 적합하게 됨
	public static void main(String[] args) {
		참조형배열정렬하기();
		sortArrayOfPrimitive();
	}

	private static void 참조형배열정렬하기() {
		//참조형,객체로 이루어진 배열이라면 해당 객체는 comparable 인터페이스를 구현해야한다. -> 참조자료형에 implements Comparable해줌
		TestAraays[] ㅁㅁㅁ = new TestAraays[3];
		for (int i = 0; i < 3; i++) {
			ㅁㅁㅁ[i] = new TestAraays();
		}
		Arrays.sort(ㅁㅁㅁ);
		for(TestAraays v : ㅁㅁㅁ)
			System.out.println(v + " ");
	}

	private static void sortArrayOfPrimitive() {
		//primitive (기본) 자료형으로 이루어진 배열은 Arrays.sort를 부르면 정렬됨! 
		int[] a = {2, 5, 2, 8};
		
		for(int v : a)
			System.out.print(v + " ");
		
		Arrays.sort(a);
		
		for(int v : a)
			System.out.print(v + " ");
	}

	@Override
	public int compareTo(TestAraays o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
