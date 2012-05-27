package HomeWorks9;

import java.util.Scanner;

public class VagnerAlg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2, str1, str2;
		s1 = in.nextLine();
		s2 = in.nextLine();
		int p = 1;
		int m = s1.length(), n = s2.length();
		int[][] d = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			d[i][0] = i;
		}
		for (int i = 0; i <= n; i++) {
			d[0][i] = i;
		}
		for (int i = 1; i <= m; i++) {
			str1 = s1.substring(0, i);
			for (int j = 1; j <= n; j++) {
				str2 = s2.substring(0, j);

				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					p = 0;

				d[i][j] = Math.min(Math.min(d[i - 1][j], d[i][j - 1]),
						d[i - 1][j - 1]) + p;
			}
			p = 1;

		}
		System.out.println(d[m][n]);
	}

}