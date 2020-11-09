package Laboratorios;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Laboratorio3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int casos = scn.nextInt();
		String respuesta = "";

		for (int i = 0; i < casos; i++) {
			int bipartito = 1;
			TreeMap<Character, Integer> vertices = new TreeMap<Character, Integer>();
			String grafo = scn.next();
			for (int j = 1; j < grafo.length(); j++) {

				if (grafo.charAt(j) == ':') {
					char raiz = grafo.charAt(j - 1);
					int actualvalor;
					if (!vertices.containsKey(raiz)) {
						vertices.put(raiz, 1);
					}
					actualvalor = vertices.get(raiz);
					if (actualvalor == 1) {
						actualvalor = 0;
					} else {
						actualvalor = 1;
					}

					while (grafo.charAt(j + 1) != ';') {

						if (!vertices.containsKey(grafo.charAt(j + 1))) {
							vertices.put(grafo.charAt(j + 1), actualvalor);
						}
						j++;
						if (j == grafo.length() - 1) {
							break;
						}

					}

				}
			}

			for (int j = 1; j < grafo.length(); j++) {
				if (grafo.charAt(j) == ':') {
					char raiz = grafo.charAt(j - 1);
					while (grafo.charAt(j + 1) != ';') {
						if (vertices.get(grafo.charAt(j + 1)) == vertices.get(raiz)) {
							bipartito = 0;
							break;
						}
						j++;
						if (j == grafo.length() - 1) {
							break;
						}

					}
				}
				if (bipartito == 0) {
					break;
				}
			}
			respuesta = respuesta + String.valueOf(bipartito) + "\n";

		}
		System.out.println(respuesta);
	}

}
