package Laboratorios;
import java.util.Scanner;

public class Laboratorio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			String entrada = sc.next();
			int j;
			String x = "";
			for (j = 0; j < entrada.length(); j++) {

				x += Character.toString(entrada.charAt(j));
				String y = entrada.replaceAll(x, "");//replaceAll https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
				if (y.length() == 0) {
					break;
				}
			}
			System.out.println(j + 1);
			System.out.println();
		}
		

	}

}
