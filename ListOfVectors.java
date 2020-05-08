package Kompozyt;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListOfVectors implements Component {
	List<ElementVector> listOfVectors = new ArrayList<ElementVector>();
	
	@Override
	public String toString() {
		return "ListOfVectors [listOfVectors=" + listOfVectors + "]";
	}
	public void addition(ElementVector vector) {
		listOfVectors.add(vector);
	}
	public void print() {
		System.out.print("");
		for(ElementVector ev : listOfVectors) {
			
			ev.print();
			System.out.print("\t");
		}
		
	}
}
