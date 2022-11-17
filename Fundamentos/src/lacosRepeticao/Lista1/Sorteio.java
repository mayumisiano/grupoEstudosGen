package lacosRepeticao.Lista1;

import java.util.Scanner;

public class Sorteio {
	
	/*Programa que simula um sorteio e o usuário precisa dar palpites até acertar*/

	public static void main(String[] args) {
		int palpite, contTentativa=0;
		int sorteio = (int)(Math.random()*(1000-0)+0);
		
		Scanner sc = new Scanner(System.in);		
			
		do{
			System.out.println("Digite o seu palpite: ");
			palpite = sc.nextInt();	
			if(palpite == sorteio) {
				System.out.println("\nParabéns, você acertou!!!");			
			}	
			else if(palpite > sorteio) {
				System.out.println("\nErrado. Dica: o número sorteado é menor");			
			}else {
				System.out.println("\nErrado. Dica: o número sorteado é maior");
			}				
			
			contTentativa++;
			
		
	}while(palpite != sorteio);
		
	contTentativa++;
		
	System.out.println("\nA quantidade de tentativas foi: "+contTentativa);
  }
}
