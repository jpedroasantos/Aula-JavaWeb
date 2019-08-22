import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		int caixa = 0;
		int conta = 0;
		int saque = 0;
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

		if (saque > conta) {
			System.out.println("Valor acima do saldo na conta");
		} else if (saque > caixa) {
			System.out.println("Valor acima do saldo do caixa eletronico");
		} else {
			if (saque == 20) {
				System.out.println("Foi sacada 1 nota de 20");
			}
			if (saque > 20 && saque < 50) {
				do {
					saque -= 20;
					vinte++;
				} while (saque > 0);
				System.out.println("Foram sacadas " + vinte + " notas de vinte");
			}
			if (saque == 50) {
				System.out.println("Foi sacada 1 nota de 50");
			}
			if (saque > 50 && saque < 100) {
				do {
					saque -= 50;
					cinq++;
				} while (saque >= 50);
				if (saque < 50) {
					do {
						saque -= 20;
						vinte++;
					} while (saque >= 20);
					System.out.println("Foram sacadas " + cinq + " notas de cinquenta e " + vinte + " notas de vinte");
				} else {
					System.out.println("Foram sacadas " + cinq + " notas de cinquenta");
				}
			}
			if (saque == 100) {
				System.out.println("Foi sacada 1 nota de 100");
			}
			if (saque > 100) {
				do {
					saque -= 100;
					cem++;
				} while (saque >= 100);
				if (saque < 100 && saque >= 20) {
					do {
						saque -= 20;
						vinte++;
					} while (saque >= 20);
					if (saque < 100 && saque >= 50) {
						do {
							saque -= 50;
							cinq++;
						} while (saque >= 50);
						if (saque < 100 && saque < 50 && saque >= 20) {
							do {
								saque -= 20;
								vinte++;
							} while (saque >= 20);
							System.out.println("Foram sacadas " + cem + " notas de 100, " + cinq
									+ " notas de cinquenta e " + vinte + " notas de 20");
						} else {
							System.out.println("Foram sacadas " + cem + " notas de 100 e " + cinq + " notas de 50");
						}
					} else {
						System.out.println("Foram sacadas " + cem + " notas de 100 e " + vinte + " notas de 20");
					}
				} else {
					System.out.println("Foram sacadas " + cem + " notas de 100");
				}
			}
		}
		s.close();
	}
}