package Kompozyt;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.println("Which matrix would you like to generate?\n");
		System.out.println("1: DenseMatrix\n");
		System.out.println("2: SparseMatrix\n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Choose number of columns and and rows\n");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		System.out.println("Choose size of the vector");
		int vectorSize = sc.nextInt();
		create(choice, side1, side2, vectorSize);
		sc.close();
	}

	public static void create(int choice, int side1, int side2, int vectorSize) {
		ElementVector[] ev = new ElementVector[side1];

		ListOfVectors[] listOne = new ListOfVectors[side2];

		Matrix matrix = new Matrix();
		int limit = (int) vectorSize / 3;
		switch (choice) {
		case 1:

			for (int i = 0; i < side2; i++) {
				listOne[i] = new ListOfVectors();
				for (int j = 0; j < side1; j++) {
					ev[j] = new ElementVector();
					for (int k = 0; k < vectorSize; k++) {

						if (k < limit) {

							Element e = new Element(0);
							ev[j].addition(e);

						} else {
							Element e = new Element(1);
							ev[j].addition(e);

						}
					}
					listOne[i].addition(ev[j]);
				}
				matrix.addition(listOne[i]);
			}

			matrix.print();
			break;

		case 2:

			for (int i = 0; i < side2; i++) {
				listOne[i] = new ListOfVectors();
				for (int j = 0; j < side1; j++) {
					ev[j] = new ElementVector();
					for (int k = 0; k < vectorSize; k++) {

						if (k > limit) {

							Element e = new Element(0);
							ev[j].addition(e);

						} else {
							Element e = new Element(1);
							ev[j].addition(e);

						}
					}
					listOne[i].addition(ev[j]);
				}
				matrix.addition(listOne[i]);
			}
			matrix.print();
			break;
		}
	}
}
