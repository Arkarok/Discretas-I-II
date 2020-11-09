import java.math.BigInteger;
import java.util.*;

public class Parcial {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String text, cifrado;

		int p, q, n, phi, e = 0;
		double d = 0, y = 1;
		p = sj.nextInt();
		q = sj.nextInt();
		n = p * q;

		phi = (p - 1) * (q - 1);

		for (int i = 3; i <= phi - 2; i++) {
			if (obtener_Mcd(phi, i) == 1) {
				e = i;
				break;

			}
		}
		do {
			d = (phi * y + 1) / e;
			y++;

		} while (d % 1 != 0);

		System.out.println("Ingresa 1 para cifrar y 2 para decifrar");
		int hacer = sj.nextInt();
		if (hacer == 1) {
			Scanner sc = new Scanner(System.in);

			text = sc.nextLine();
			cifrado = "";
			for (int i = 0; i < text.length(); i++) {
				int ascci = text.charAt(i);
				double c = (Math.pow(ascci, e)) % n;
				cifrado = cifrado + (int) c + " ";

			}
			System.out.println(cifrado);
		} else {
			String deco = "";
			Scanner si = new Scanner(System.in);
			String codigo = si.nextLine();
			List<String> v = Arrays.asList(codigo.split(" "));
			
			for (int i = 0; i < v.size(); i++) {
				
				long a=Long.parseLong(v.get(i));
				long z=(long)d;
				long h=(long)n;
				BigInteger t=new BigInteger("0");
				BigInteger r=new BigInteger("0");
				BigInteger b=new BigInteger("0");
				BigInteger o=new BigInteger("0");
				b=(t.valueOf(a).modPow(t.valueOf(z),o.valueOf(h)));
				
				
				deco=deco+b+" ";
				
			}
			System.out.println(deco);

		}
	}

	public static int obtener_Mcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return obtener_Mcd(b, a % b);
		}
	}

}
