package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		// Ler o teclado do usu�rio
		
			Scanner leitor = new Scanner(System.in);
			Random gerador = new Random();
			
			// Variaveis 
			
			int numeroDoUsuario;
			int escolhaDoComputador;
			
			// 1 - Papel; 2 - Pedra; 3 - Tesoura.
			// Usu�rio (1) = Computador (2) = - 1 - Vencedor Usu�rio
			// Usu�rio (1) = Computador (3) = - 2 - Vencedor Computador
			// Usu�rio (2) = Computador (1) =  1 - Vencedor Computador
			// Usu�rio (2) = Computador (3) = - 1 - Vencedor Usu�rio
			// Usu�rio (3) = Computador (1) =  2 - Vencedor Usu�rio
			// Usu�rio (3) = Computador (2) =  1 - Vencedor Computador
			
			
			numeroDoUsuario = leitor.nextInt();
			escolhaDoComputador = gerador.nextInt(3) + 1; // Gerar um numero entre 1 e 3.
			
			// Visualizar a op��o do computador
			
			switch(escolhaDoComputador) {
				case 1:
					System.out.println("Computador escolheu: Papel!");
					break;
				
				case 2:
					System.out.println("Computador escolheu: Pedra!");
					break;
				
				case 3:
					System.out.println("Computador escolheu: Tesoura!");
					break;
				
			}
			
			// Resultados do Jogo:
			
			if (numeroDoUsuario == escolhaDoComputador) {
				System.out.println("Empate");
				
			}else if(numeroDoUsuario - escolhaDoComputador == -1 || 
					 (numeroDoUsuario - escolhaDoComputador) == 2){
				System.out.println("Usu�rio Vencedor");
				
			}else {
				System.out.println("Computador Vencedor");
			}
			
			
			
			
			
		
			

			
			
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
