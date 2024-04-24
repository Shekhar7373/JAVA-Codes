
class IaMarksException extends Exception {
	private String title;

	public IaMarksException(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}

public class IaDemo {
	public static void main(String[] args) {
		int iaMarks = 27;

		if (iaMarks <= 0) {
			try {
				throw new IaMarksException("Ia Marks Cannot be negative");
			} catch (IaMarksException im) {
				im.printStackTrace();
			}
		} else if (iaMarks > 20) {
			try {
				throw new IaMarksException("Ia Marks Cannot be greater than 20");
			} catch (IaMarksException im) {
				im.printStackTrace();
			}
		} else {
			System.out.println("IA - Marks : " + iaMarks);
		}
	}
}