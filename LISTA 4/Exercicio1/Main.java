public class Main
{
	public static void main(String[] args)
	{
		//o metodo tamanho() presente na classe Lista tem a complexidade de O(n) pois ele percorre todos os elementos da lista

		//é possivel conseguir um metodo com complexidade O(1) adicionndo um atributo tamanho na clase e acrescendo ele no meotodo insere() ou
		//decrescendo ele no metodo remove(), assim o metodo tamanho somente retornaria o valor desse atributo, porem esta solução consome mais memoria.



		//Exemplo
		Lista lista = new Lista();

		for (int i = 0; i < 7; i++){  //adicionar elementos a lista
			lista.insere(i);
		}

		System.out.println(lista.tamanhoEx1());  


	}
}