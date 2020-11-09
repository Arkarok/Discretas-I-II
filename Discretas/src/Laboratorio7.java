import java.util.Scanner;

public class Laboratorio7 {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);

		while (en.hasNext()) {

			int cont = 1;

			long p = 1;

			long n = en.nextInt();

			while (p != 0) {

				if (n < p) {
					
					cont = 0;
					break;
				}

				if (n > p) {
					cont++;
				}

				p = p * 10 + 1;
				p %= n;
			}
			
			System.out.println(cont);
		}

	}

}
