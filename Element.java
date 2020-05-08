package Kompozyt;



public class Element implements Component {
	int val;
	

	public Element(int val) {
		super();
		this.val = val;
	}
	public void print() {
		System.out.print(val);
		
	}
}
