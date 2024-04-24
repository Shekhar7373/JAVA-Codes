package oops.demo;
import java.util.Scanner;
import oops.grade.*;
public class MarksDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			TotalMarks s[];
			s = new TotalMarks[3];
			int i = 0;
			while(i < 3) {
				s[i] = new TotalMarks();
				System.out.println("Enter Student details : ");
				System.out.println("IA1 : ");
				int IA1 = sc.nextInt();
				System.out.println("IA2 : ");
				int IA2 = sc.nextInt();
				System.out.println("IA3 : ");
				int IA3 = sc.nextInt();
				s[i].computeMarks(IA1, IA2, IA3);
			}
		}
	}

}
