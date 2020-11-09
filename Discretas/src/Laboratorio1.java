import java.math.BigInteger;
import java.util.*;
public class Laboratorio1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
				
		int number;
		
		number=scan.nextInt();
		
		int pentagonal,acumPenta=0;
		BigInteger fibonacci=new BigInteger("0");
		BigInteger uno=new BigInteger("1");
		BigInteger dos=new BigInteger("0");
		BigInteger acumFibo=new BigInteger("0");
		
		for (int i = 1; i <= number; i++) {
			
			
			pentagonal=i*(i*3-1)/2;
			acumPenta=pentagonal+acumPenta;
			
			
			if(i<number) {
				fibonacci=uno.add(dos);
				uno=dos;
				dos=fibonacci;
				acumFibo=fibonacci.add(acumFibo);
			}
		}

		BigInteger com=new BigInteger("0");
		System.out.println(acumFibo.multiply(com.valueOf(acumPenta)));
		
	}
}
