package EX1;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

		Scanner scanner = new Scanner(System.in);
		TesteSO callStack = new TesteSO(5);
		
		int opt;
		String nome;
		int id;
		
		
		do
		{
			System.out.println("Insira:\n1 para adicionar um elemento a fila\n2 para retirar o processo com maior tempo " +
            "de espera\n3 para imprimir a fila\n0 para sair do sistema");
            opt = scanner.nextInt();
			
			switch(opt) {
			case 1:
				System.out.println("\nInsira o nome do processo: ");
				nome = scanner.next();
				System.out.println("Insira o ID: ");
				id = scanner.nextInt();

				Processos processo = new Processos(nome, id);
				callStack.insere(processo);
				System.out.println("\n");
					
				break;
				
			case 2:
				callStack.remove();
				break;

			case 3:
				System.out.println("\nConteudo da fila:");
				callStack.imprime();
				System.out.println("\n");
				break;    
				
			default:
			System.out.println("Opção inválida\n");

			break;

			case 0:
			break;
			}

			
			
		}while(opt != 0);
	
		scanner.close();
	}
}