public class Main
{
	public static void main(String[] args)
	{
		ListaDuplamente lista = new ListaDuplamente();

		for(int i = 1; i <=5; i++){
			lista.insere(i);
		}
		
		lista.imprime();
		lista.trocaElos(1, 3);
	}
}