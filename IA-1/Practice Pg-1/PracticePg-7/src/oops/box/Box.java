package oops.box;

public class Box {

	private double width;
	private double height;
	private double depth;

	protected Box() {
		this.depth = 0.0;
		this.height = 0.0;
		this.width = 0.0;
	}

	protected Box(double x) {
		this.depth = x;
		this.width = x;
		this.height = x;
	}

	protected Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public void volume() {
		System.out.println("Inside Box Volume");
	}
}
