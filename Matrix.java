package Kompozyt;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Matrix implements Component{
@Override
	public String toString() {
		return "Matrix [matrix=" + matrix + "]";
	}
List<ListOfVectors> matrix = new ArrayList<ListOfVectors>();

public void addition(ListOfVectors listOfVectors) {
	matrix.add(listOfVectors);
}
public void print() {
	
for(ListOfVectors lv : matrix) {
	System.out.println("");
	lv.print();
}
		
}
}
