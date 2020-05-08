package Kompozyt;

import java.util.Vector;

public class ElementVector implements Component {
	
	@Override
	public String toString() {
		return "ElementVector [vector=" + vector + "]";
	}
	Vector<Element> vector = new Vector();
	public void addition(Element e) {
		vector.add(e);
	}
	public void print() {
		System.out.print("");
		for(Element el : vector) {
			
			el.print();
		}
		
	}
}
