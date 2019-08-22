import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		int caixa = 0;
		int conta = 0; 
		int saque=0; 
		int vinte = 0; 
		int cinq = 0; 
		int cem = 0; 

		
		Scanner s = new Scanner(System.in); 
		System.out.print("Digite o valor no caixa eletrônico: ");
		caixa = s.nextInt(); 
		System.out.print("Digite o valor na sua conta: ");
		conta = s.nextInt(); 
		System.out.print("Diga o valor do saque que deseja fazer: "); 
		saque = s.nextInt(); 
		
		if(saque > conta) {
			System.out.println("Valor acima do saldo na conta");
		} else
		if(saque > caixa) {
			System.out.println("Valor acima do saldo do caixa eletronico");
		} else {
			if(saque < 50) {
				do {
					saque-=20; 
					vinte++;
				} while(saque > 0); 
				if(saque % 20 < 0) {
					System.out.println("Valor inválido pra saque");
				} else {
				System.out.println("Foi(Foram) sacada(s) "+vinte+" nota(s) de vinte"); 
				}
			} 
			if(saque >= 50 ) {
				do {
					saque-=50; 
					cinq++; 
					} while(saque > 0); 
					if(saque > 0 && saque % 50 == 0) {
						saque-=20; 
						vinte++;
					} 
					System.out.println("Foram sacadas "+cinq+" notas de cinquenta e "+vinte+" notas de vinte");
			}
		}
	}

}
