package strings;

import java.util.Scanner;

public class Count_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count=0;
		for(char c: str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		in.close();

	}

}
