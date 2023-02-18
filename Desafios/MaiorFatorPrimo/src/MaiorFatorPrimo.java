/*
 The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
public class MaiorFatorPrimo {
	
	public static void main(String[] args) {
		long r = maiorFatorPrimo(144);
		
		System.out.println(r);
	}	
	
	private static long maiorFatorPrimo(long a) {
		long r = a;	
		for(long i = 2; i < Math.sqrt(a); i++){
			if(a % i == 0) {
				return maiorFatorPrimo(a/i);
			}
		}
		return r;
	}
}
