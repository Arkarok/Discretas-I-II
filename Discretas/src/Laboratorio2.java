import java.util.*;
public class Laboratorio2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int T,k,n;
		String resultado="";
		
		T=entrada.nextInt();//T=2
		
		for (int i = 1; i <=T; i++) { //i=1 menor que 2
			
			n=entrada.nextInt();//5
			k=entrada.nextInt();//1
			
			int[] vector=new int[n];//5
			List<String> lista=new ArrayList<>();
			
			for (int j = 0; j <n; j++) {//j=0 menor que 5
				vector[j]=entrada.nextInt();// 41223
			}
			
			for (int j = 0; j <n; j++) {//j=0 menor que 5
				for (int a = 0; a <n; a++) {//a=0 menor que 5
					
					
					if(j!=a) 
					{
						if(vector[j]<=vector[a] && (vector[j]+vector[a])%k==0) 
						{
							for(String item: lista) {
								if((item.contentEquals(vector[j]+","+vector[a]))) 
								{
									lista.add(vector[j]+","+vector[a]);
									
								}
							
							}
							//lista.add(vector[j]+","+vector[a]);
						}
					}
					else 
					{
						continue;
					}
				}
			}
			
			resultado+="Case "+i+": "+lista.size()+"\n";
		}
		
		System.out.println(resultado);
	}

}
