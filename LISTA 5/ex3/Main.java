public class Main
{
	public static void main(String[] args)
	{
		ListaCircular lista = new ListaCircular();

		for(int i = 1; i <= 5; i++){
			lista.insere(i);
		}

		lista.imprime();
		lista.inverteLista();
		lista.imprime();

	}
}