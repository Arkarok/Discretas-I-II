import java.util.*;

public class Laboratorio5 {

	public static int suma(int n) {

		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int ncasos, caso, acum = 0, cason;

		Scanner en = new Scanner(System.in);

		ncasos = en.nextInt();
		int primo = 0;
		for (int i = 0; i < ncasos; i++) {

			caso = en.nextInt();
			
			while (true) {

				caso++;
				acum = 0;
				primo = 0;
				int tem = caso;

				cason = (int) Math.sqrt(caso);

				for (int j = 2; j <= cason; j++) {

					while (tem % j == 0) {

						tem = tem / j;
						acum = acum + suma(j);
						primo = 1;

					}

				}

				if (tem != 1) {
					acum += suma(tem);
				}
				if (primo == 0) {
					continue;
				}
				if (acum == suma(caso)) {
					break;
				}

			}

			System.out.print(caso);

		}

	}
}
