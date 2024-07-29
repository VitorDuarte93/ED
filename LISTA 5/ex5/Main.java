import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ListaDuplamente lista = new ListaDuplamente();
		ListaDuplamente lista2 = new ListaDuplamente();

		for(int i = 1; i <= 5; i++){
			lista.insere(i);
		}
		lista.imprime();

		for(int i = 1; i <= 5; i++){
			lista2.insere(i);
		}
		lista2.imprime();

		System.out.println(lista.verificaIgualdade(lista2));
		
		
	}
}