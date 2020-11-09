package Laboratorios;

import java.util.Scanner;

public class Laboratorio2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int casos = scn.nextInt();

		for (int i = 0; i < casos; i++) {
			String resultado = "";

			String grafo = scn.next();

			for (int j = 1; j < grafo.length(); j++) {

				if (grafo.charAt(j) == ':') {

					String vert = Character.toString(grafo.charAt(j - 1));
					int salidas = -2;

					while (grafo.charAt(j) != ';') {
						salidas++;
						j++;
						if (j == grafo.length()) {
							break;
						}

					}
					for (int k = 0; k < grafo.length(); k++) {
						String value = Character.toString(grafo.charAt(k));

						if (value.equals(vert)) {
							salidas++;
						}

					}

					if (resultado == "") {
						resultado = resultado + vert + "=" + salidas;
					} else {
						resultado = resultado + ", " + vert + "=" + salidas;
					}

				}

			}
			System.out.println(resultado);

		}

	}

}
