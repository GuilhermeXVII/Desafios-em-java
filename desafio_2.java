/*Importando scanner.
*Importando o InputMismatchException para colocar o try mais o catch.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

//Verificar se um número informado pelo usuário é primo.
//Número primo: é todo número que é divísivel por 1 e por ele mesmo.
/* 
*x / 1 e x/x
*Exmplo:
* 7/7 e 7/1.
*/

public class desafio_2{
	public static void main(String[] args){
		
		//Criando o leitor.
		//Scanner.
		
		Scanner scanner = new Scanner(System.in);
		
		
		// Ele identifica erros ao decorrer do programa. Desde de sua abertura.
		try{
			
			//Pega o nome do usuário é deseja boas-vindas.
			System.out.println("Entre com o seu nome: ");
			String userName = scanner.nextLine();
			System.out.println("Seja bem-vindo ao verificador de número primo " + userName);
			
			//Pega o número que o usuário digitou
			System.out.println(userName + ", digite um número inteiro");
			int numberUser = scanner.nextInt();
			
			//Expressão booleanda verdadeira(true)
			boolean ehPrimo = true;
			
			//Loop com o divisor igual a 2; 2 menor ou igual a numero que o usuário digitou, vai incrementando a cada vez mais um
			for(int divisor = 2; divisor < numberUser; divisor++){
				//Condição para verificar se é igual a zero o resultado da divisão
				if(numberUser %divisor ==0){
					ehPrimo = false;
					break;
				}
			}
			
			//Condição final
			//Se primo for verdadeiro, ele imprime a mensagem do for, caso não imprime a mensagem do else
			if(ehPrimo){
				System.out.println("Esse número é primo, parabéns " + userName);
			}else{
				System.out.println("Lamento, mas esse número não é primo não, " + userName);
			}



		// Catch fica no final do try é coloca uma mensagem de sua preferencia caso o
		// usuário digite qualquer outra coisa além de número do dado pedido.
		} catch (InputMismatchException e) {
			System.out.println("Por favor, entre com um número!");
		}
		scanner.close();
	}
}
