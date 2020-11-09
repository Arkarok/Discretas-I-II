package Laboratorios;

import java.util.*;

import javax.sound.midi.Soundbank;

public class parcial {

	public static void dyam(int[][] matriz, char[][] letras, int inicio, int tam, int acum, int[] ponder, char letra) {

		for (int i = 0; i < tam; i++) {

			int obtenido = matriz[inicio][i];
			if (obtenido != 0) {
				if (obtenido + acum < ponder[i] && letra != letras[inicio][i]) {
					ponder[i] = obtenido + acum;
					letra = letras[inicio][i];

					dyam(matriz, letras, i, tam, ponder[i], ponder, letra);

				}

			}
			obtenido = matriz[i][inicio];
			if (obtenido != 0) {
				if (obtenido + acum < ponder[i] && letra != letras[i][inicio]) {
					ponder[i] = obtenido + acum;
					letra = letras[i][inicio];

					dyam(matriz, letras, i, tam, ponder[i], ponder, letra);

				}

			}

		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cantWord = scn.nextInt();// Leemos la cantidad de aristas/palabras que relacionan dos vertices/idiomas
		while (cantWord != 0) {// mientras que la cantidad siga siendo diferente de 0 realizamos un nuevo
								// caso
			String ruta[] = new String[2];//creamos un array llamado ruta
			ruta[0] = scn.next();// recibimos el vertice de origen
			ruta[1] = scn.next();// recibimos el vertice de destino
			ArrayList<String> idiomas = new ArrayList<String>();//creamos una lista llamada idiomas

			ArrayList<String> todos = new ArrayList<String>();//y otra llamada todos
			for (int i = 1; i <= cantWord * 3; i++) {

				if (i % 3 != 0) {
					String idioma = scn.next();
					todos.add(idioma);// en la lista todos guardamos todos los elementos (idiomas y palabras) en el orden de entrada
					if (!idiomas.contains(idioma)) {
						idiomas.add(idioma);// en la lista idiomas guardamos los idiomas sin repeticiones debido a que ellos son los vertices del grafo
					}

				} else {
					String palabra = scn.next();
					todos.add(palabra);// guardamos todos los elementos (palabras e idiomas ) en el orden de entrada
				}

			}
			if (idiomas.contains(ruta[0]) && idiomas.contains(ruta[1])) {// verificamos que el inicio y el final existan
																			// ya que de lo contrario es imposible dar con el
																			// fin
				int n = idiomas.size();//recibimos la cantidad de vertices del grafo para determinar el tamaño de las siguientes matrices
				int grafo[][] = new int[n][n];// cremos una matriz llamada grafo para los valores que relacionan/ponderados
				char letras[][] = new char[n][n];// creamos una matriz llamada letras para tener encuennta la primera letra de la
													// palabra que relaciona dos vertices
				for (int i = 0; i < idiomas.size(); i++) {
					for (int j = 0; j < idiomas.size(); j++) {
						grafo[i][j] = 0;// llenamos la matriz con valores de defecto en este caso 0 porque ninguna palabra es de 0
						letras[i][j] = ':';// llenamos la matriz con valores de defecto en este caso es : porque ninguna palabra empiesa en :
					}
				}
				for (int i = 0; i < todos.size(); i++) {
					int x;
					int y;
					String i1 = todos.get(i);// obteneos el primer idioma 
					String i2 = todos.get(i + 1);// obtenemos el segundo idioma 
					String p = todos.get(i + 2);// obtenemos la palabra que relaciona el primer idioma con el segundo

					x = idiomas.indexOf(i1); // obtenemos la ubicacion del primer idioma 
					y = idiomas.indexOf(i2);// obtenemos la ubicacion del segundo idioma 

					grafo[x][y] = p.length();// en la matriz grafo donde se cruzan los dos idiomas ponemos el tamaño de la palabra
					letras[x][y] = p.charAt(0);// y en la matriz letras donde se cruzan los dos idiomas ponemos la primera letra de la
												// palabra
					i = i + 2; // iteramos para pasar al siguiente conjunto de idiomas

				}
				int ponder[] = new int[idiomas.size()];
				for (int i = 0; i < ponder.length; i++) {
					ponder[i] = 1000;

				}

				int inicio = idiomas.indexOf(ruta[0]);
				int acum = 0;
				char letra = '!';
				dyam(grafo, letras, inicio, n, acum, ponder, letra);
				if (ponder[idiomas.indexOf(ruta[1])] == 1000) {//existe la posibilidad de que el vertice exista pero este aislado, esto lo sabemos cuando 
					System.out.println("impossivel");          // nunca se actualiza el ponderado de la ruta por tanto es imposible debido a que puede
															   // que un sub vertice este aislado del resto lo cual nos inpide recorrer el camino mas corto
				} else {
					System.out.println(ponder[idiomas.indexOf(ruta[1])]);// en caso de llegar al else significa que hemos hallado el camino
					                                                     //mas corto por tanto procedemos a imprimirlo
				}

			} else {
				System.out.println("impossivel");// como se mensiono arriba si el inicio y el final no existen, es imposible llegar al final por lo cual
				                                 //imprimimos impossible
			}
			cantWord = scn.nextInt(); //ya por ultimo en cantword se agregaran los siguientes casos para que puedan ser evaluados, en el caso de ser 0
			                          // finaliza el codigo.

		}

	}

}
