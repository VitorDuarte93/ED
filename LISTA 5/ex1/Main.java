public class Main
{
	public static void main(String[] args)
	{
		ListaDuplamente lista1 = new ListaDuplamente();
		ListaDuplamente lista2 = new ListaDuplamente();
		ListaDuplamente lista3 = new ListaDuplamente();


		for(int i = 0; i <= 5; i++){
			lista1.insere(i);
		}
		
		for(int i = 3; i <= 7; i++){
			lista2.insere(i);
		}

		lista1.imprime();
		lista2.imprime();

		lista3 = lista3.intersecao(lista1, lista2);

		lista3.imprime();

	}
}