package desafiosdeLogica;

//Verificando se o número fornecido pelo usuário é primo.
//Número primo, número que é dívisivel por 1 e por ele mesmo.

/*
 * Ex:
 *  2, 3, 5, 7, 11, ....etc
 * */

//Importando o scanner
import java.util.Scanner;
import java.util.InputMismatchException;
public class desafio_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("Entre com o número que você deseja para verificar se ele é primo ou não: ");
			int numeroUsuario = scanner.nextInt();
			
		
		}catch (InputMismatchException e) {
			System.out.println("Entre com um número para verificar se ele é primo ou não!");
		}
		
		scanner.close();
		
	}
}
