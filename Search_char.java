package strings;
import java.util.Scanner;
public class Search_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter the search");
		String s = sc.nextLine();
		boolean found=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==s.charAt(0)) {
			found=true;
			}
		}
		if(found) {
			System.out.println("Found");
		}
		sc.close();

	}

}
