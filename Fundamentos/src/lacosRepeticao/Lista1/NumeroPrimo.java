package lacosRepeticao.Lista1;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		int N, contPrimo=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		N = sc.nextInt();
		
		for(int x=1; x<=N;x++) {
			if(x % 1 == 0 && N % x == 0){
				contPrimo++;
			}			
			
		}
		
		if (contPrimo == 2) {
		    System.out.println(N + " é um número primo");
		} else {
		    System.out.println(N + " não é número primo");
		}		
	}
}
