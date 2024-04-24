package oops.commandline;

public class CommandLineDemo {
	public static void main(String[] args) {
		// Check if any arguments are passed
		if (args.length == 0) {
			System.out.println("No command line arguments provided.");
		} else {
			System.out.println("Command line arguments:");
			// Print each command line argument
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
			}
		}
	}
}
