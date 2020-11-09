import java.util.Scanner;

public class Laboratorio3 {

	public static String Inver(String x) {

		String y = "";
		for (int i = x.length() - 1; i >= 0; i--) {

			y = y + x.charAt(i);

		}
		return y;
	}

	public static void main(String[] args) {

		int N, cos, res, i = 0, n;

		Scanner entrada = new Scanner(System.in);

		N = entrada.nextInt();

		for (i = 1; i <= N; i++) {

			String g = "";
			n = entrada.nextInt();

			while (true) {

				cos = n / -2;
				res = n - (cos * -2);

				if (res < 0) {

					cos++;
					res = n - (cos * -2);
				}

				n = cos;
				g = g + res;

				if (cos == 0) {
					break;
				}
			}

			System.out.println("Case #" + i + ": " + Inver(g));
		}
	}

}