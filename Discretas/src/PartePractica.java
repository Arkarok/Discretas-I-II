import java.util.Scanner;

public class PartePractica {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);

		float vt, vo;

		while (true) {

			vt = en.nextFloat();
			vo = en.nextFloat();

			if (vt == 0 && vo == 0) {
				break;
			}

			if (vt <= vo) {
				System.out.println(0);
			} else {

				double d, r;
				int ro;

				d = 0.5 * (vt / vo);
				r = Math.sqrt(d);
				ro = (int) Math.sqrt(d);

				if (r - ro > 0.5) {

					int fin = ro + 1;

					if (fin > 1000) {
						fin = fin % 1000;
						System.out.println(fin);
					} else {
						System.out.println(fin);
					}

				} else {

					if (ro > 1000) {

						ro = ro % 1000;

						System.out.println(ro);
					} else {

						System.out.println(ro);
					}
				}

			}

		}

	}

}
