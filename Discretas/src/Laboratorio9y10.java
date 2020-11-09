import java.util.Scanner;

public class Laboratorio9y10 {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);

		int T;

		T = en.nextInt();

		while (T > 0) {

			String x;

			x = en.next();

			String[] textArray;
			textArray = x.split("\\|");

			int i = 0;
			for (i = 0; i < textArray.length; i++) {
				boolean f = true;
				String value = textArray[i];
				int j = 0;
				for (j = 0; j < value.length(); j++) {
					char var;
					if (value.charAt(j) == '(' || value.charAt(j) == '&' || value.charAt(j) == ')') {
						continue;
					}
					boolean inver = false;
					if (value.charAt(j) == '~') {
						j++;
						var = value.charAt(j);
						inver = true;
						for (int k = j + 2; k < value.length() - 1; ++k) {
							if (value.charAt(k) == '~' && value.charAt(k + 1) == var && !inver) {
								f = false;
								break;
							} else if (value.charAt(k) == var && value.charAt(k - 1) != '~' && inver) {
								f = false;
								break;
							}

						}

					} else {
						var = value.charAt(j);
						for (int k = j + 2; k < value.length() - 1; ++k) {
							if (value.charAt(k) == '~' && value.charAt(k + 1) == var && !inver) {
								f = false;
								break;
							} else if (value.charAt(k) == var && value.charAt(k - 1) != '~' && inver) {
								f = false;
								break;
							}

						}
					}
					if (!f) {
						break;
					}
				}
				if (j == value.length()) {
					System.out.println("YES");
					break;
				}
			}
			if (i == textArray.length) {
				System.out.println("NO");
			}
		}
	}

}
