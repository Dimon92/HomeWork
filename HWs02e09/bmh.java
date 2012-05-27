package HomeWorks10;

import java.util.Scanner;

public class bmh {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1, str2;
		str1 = in.nextLine();
		str2 = in.nextLine();
		char[] s = str1.toCharArray(), t = str2.toCharArray();
		int a[] = new int[500];
		for (int i = 0; i < 500; i++) {
			a[i] = t.length;
		}
		for (int i = t.length - 1; i >= 0; i--) {
			a[t[i]] = i + 1;
		}
		int q = 0, p = 1;
		while (p != t.length + 1 && q != s.length - t.length + 1) {
			if (t[t.length - p] == s[q + t.length - p]) {
				p++;
			} else {
				q += a[s[q + t.length - p]];
				p = 1;
			}
		}
		if (q == s.length - t.length + 1)
			q = -1;
		System.out.println(q);
	}
}
