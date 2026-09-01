package strings;
import java.util.Scanner;
public class Merge_strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2=sc.nextLine();
		str1+=str2;
		System.out.println(str1);
		sc.close();
	}

}
