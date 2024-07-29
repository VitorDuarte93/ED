
public class Main
{
	public static void main(String[] args)
	{
		 ListaCircular lista1 = new ListaCircular();
		 ListaCircular lista2 = new ListaCircular();

		 for(int i = 0; i <= 5; i++){
			lista1.insere(i);
		 }

		 for(int i = 6; i <= 10; i++){
			lista2.insere(i);
		 }

		 lista1.imprime();
		 lista2.imprime();

		 ListaCircular lista3 = new ListaCircular();

		 lista3 = lista1.merge(lista2);

		 lista3.imprime();

	}
}