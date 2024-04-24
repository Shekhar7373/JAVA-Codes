package oops.grade;

public class TotalMarks {

	public void computeMarks(int IA1, int IA2, int IA3) {
		int min;
		if (IA1 < IA2 && IA1 < IA3) {
			min = IA1;
		} else if (IA2 < IA1 && IA2 < IA3) {
			min = IA2;
		} else {
			min = IA3;
		}
		int result = IA1 + IA2 + IA3 - min;
		result = result *2;
		if (result >= 90 && result <= 100) {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : S");
		} else if (result >= 80 && result <= 90) {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : A");
		} else if (result >= 70 && result <= 80) {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : B");
		} else if (result >= 60 && result <= 50) {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : C");
		} else if (result >= 35 && result <= 40) {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : D");
		} else {
			System.out.println("Student details : \nIA1 : " + (IA1) + "\nIA2 : " + (IA2) + "\nIA3 : " + IA3
					+ "\nObtained Grade : F");
		}
	}
}
