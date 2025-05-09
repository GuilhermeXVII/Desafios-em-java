package desafiosdeLogica;

//Tabuada:

//Importando o scanner
import java.util.Scanner;
import java.util.InputMismatchException;

public class desafio_1 {
	public static void main(String[] args) {
		System.out.println("Testando essa baranga!");

		// Objetivo:
		/*
		 * Criar um programa que multiplique um número x escolhido pelo usuário até 10.
		 * Nesse programa eu usei o Scanner. Ele serve para que o usuário entre com um.
		 * tipo de dado.
		 * 
		 */

		// Criando o leitor.
		// Faz de conta que Scanner leitor = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		// Ele identifica erros ao decorrer do programa. Desde de sua abertura.
		try {

			// Pedindo para que o usuário entre com um número.
			// Faz de conta que Scanner leitor = new Scanner(System.in);
			System.out.println("Entre com um número que deseja multiplicar de 1 a 10: ");
			double numeroEscolihdo = scanner.nextDouble(); // lêr um número inteiro -- número decimal.

			// Fazendo um casting, ou seja, deixando o mais redondo possível.
			int numeroArredondado = (int) numeroEscolihdo;

			/*
			 * Aqui está o multiplicador. Ele vai ser menor ou igual ao 10. Ou seja, quando
			 * ele chegar no 10, ele para.
			 */

			int multiplicador = 1;

			// Nosso loop, while
			while (multiplicador <= 10) {
				System.out.println("Aqui está o número multiplicado do 0 ao 10: " + numeroArredondado + " x "
						+ multiplicador + " = " + (multiplicador * numeroArredondado));
				multiplicador++; // Ao final do loop, adicionamos o nosso incrementador que pode ser ++ ou +=1.

			}

			// Catch fica no final do try é coloca uma mensagem de sua preferencia caso o
			// usuário digite qualquer outra coisa além de número do dado pedido.
		} catch (InputMismatchException e) {
			System.out.println("Entre com um número!");
		}

		// Fechamento do scanner ao final do programa.
		scanner.close();

	}
}
