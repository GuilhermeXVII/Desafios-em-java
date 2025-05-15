import java.util.Scanner;
import java.util.InputMismatchException;
public class advinhaoNumero{
	public static void main(String[] args){
		/*
		*Gera um número aleatório em java.
		* Depois arredonda ele.
		* */
		int numeroAleatorio = (int)Math.round(Math.random()*100);

		//Criando o scanner.
		Scanner scanner = new Scanner(System.in);

			//Abrindo o try, ele verifica se tem erros que o usuário digitar ao decorrer do programa.
			try {

				//Entra pedindo o nome do usuário e deseja boas vindas.
				System.out.println("Entre com o seu nome: ");
				String nomeUsuario = scanner.nextLine();
				System.out.println("Seja bem-vindo Sr(a) " + nomeUsuario + ".");

				//Entra pedindo o número que o usuário deseja.
				System.out.println(nomeUsuario + ", por favor, entre com um número de 0 a 100: ");
				int numeroSelecionado = scanner.nextInt();
				System.out.println("Você ESCOLHEU o número: " + numeroSelecionado);

				//Condicional, que verifica se ele é o número certo ou não!
				if (numeroAleatorio == numeroSelecionado) {
					System.out.println("Parabéns " + nomeUsuario + ", você ACERTOU!");

				} else {
					System.out.println("Lamento " + nomeUsuario + ", tente novamente.");
					System.out.println("O número sorteado foi: " + numeroAleatorio);

				}

			//Mensagem final caso o usuário não digite algo esperado pelo programa.
			}catch (InputMismatchException e){
				System.out.println("Entre com um número inteiro, por favor!");

			}

			//Fechamento do scanner
			finally {
				scanner.close();
			}
	}
}