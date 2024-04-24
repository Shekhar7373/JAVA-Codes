package oops.sorting;

public class Sorting {
	public void sorting(double arr[], int n) {
		int i;
		int j;
		for(i = 0; i < n-1; i++)
		{
			for(j = 0; j < n-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					double temp  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(double a : arr) {
			System.out.print("\t"+a);
		}
	}
}
