import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Toggled String : ");
		char ch;
		for (int i = 0; i <name.length(); i++) {
			ch = name.charAt(i);
			if (Character.toUpperCase(ch) == ch) {
				System.out.print(Character.toLowerCase(ch));
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}

}