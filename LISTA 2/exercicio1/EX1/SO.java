package EX1;


public class SO
{
	protected int tamanho;
	protected Processos[] vetor;
	protected int ini;	
	protected int n;
	
	public SO(int tam)
	{
		tamanho = tam;
		vetor = new Processos [tamanho];
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retira o elemento do FIM da fila, pois é o com maior tempo de espera ate ser executado
	public Processos remove()
	{
		Processos elemento = null;
		
		if (!this.vazia())
		{
			elemento = vetor[0];
			n--;
		} else {
			System.out.println("A fila está vazia\n");
		}

		return elemento;
	}
	

	public boolean insere(Processos elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
}