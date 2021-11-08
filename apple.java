import java.util.Scanner;

class apple{
	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = input.nextLine();
		tunaObject.simpleMessage(name);
	}
}