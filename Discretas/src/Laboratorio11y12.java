import java.util.*;

public class Laboratorio11y12 {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);

		while (true) {

			List<Integer> cartasalicia = new ArrayList<Integer>();
			List<Integer> cartasbety = new ArrayList<Integer>();

			int a = en.nextInt();

			int b = en.nextInt();

			if (a == 0 && b == 0) {
				break;
			}

			int conta = 0;
			int contb = 0;
			

			for (int i = 0; i < a; i++) {

				int x = en.nextInt();

				if (!cartasalicia.contains(x)) {
					cartasalicia.add(x);
				} else {
					conta++;
				}

			}
			for (int i = 0; i < b; i++) {

				int y = en.nextInt();

				if (!cartasbety.contains(y)) {
					cartasbety.add(y);
				} else {
					contb++;
				}

			}

			for (Integer integer : cartasalicia) {
				if (cartasbety.contains(integer)) {
					conta++; contb++;
				}
			}

			int q = (a - conta) ;
			int p = (b - contb) ;
			if (q > p) {

				System.out.println(p);
			} else {
				System.out.println(q);
			}
		}
	}

}
