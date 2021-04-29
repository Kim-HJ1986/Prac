package cloneable;

public class Arm {
	private int length;

	public Arm(int length) {
		super();
		this.length = length;
	}


	public Arm clone() {
		return new Arm (length);
	}

	
}
