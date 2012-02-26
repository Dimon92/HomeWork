package HomeWorks;

import java.util.Scanner;

public class PoleChudes {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		String s = f.next();
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			a += "X";
		}
		System.out.println(a);
		while (!a.equals(s)) {
			String o = f.next();
			for (int i = 0; i < s.length(); i++) {
				if (o.equals(s.substring(i, i + 1).toLowerCase())
						|| (o.equals(s.substring(i, i + 1).toUpperCase()))) {
					a = a.substring(0, i) + s.charAt(i) + a.substring(i + 1);
				}
			}
			System.out.println(a);
		}
		System.out.println("Congratulations! You Win!");
	}
}
