package cloneable;

public class Body implements Cloneable {

	private int weight;

	private Arm leftArm, rightArm;

	public Body(int weight, Arm leftArm, Arm rightArm) {
		super();
		this.weight = weight;
		this.leftArm = leftArm;
		this.rightArm = rightArm;
	}

	@Override
	public Body clone() {
		// 내가 가지고 있는 기본형 정보만 복사해줌. swallow copy. new Body(weight, null, null)
		// 내가 가지고 있는 참조형 정보까지 몽땅 복사해줌. Deep copy
		return new Body(weight, leftArm.clone(), rightArm.clone());
	}
	
}
