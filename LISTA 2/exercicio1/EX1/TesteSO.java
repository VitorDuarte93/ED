package EX1;

public class TesteSO extends SO
{	
	public TesteSO(int tam)
	{
		super(tam);
	}
	
	public void imprime()
	{
		int i, j;
		
		if (vazia())
			System.out.println("Fila está vazia.");
		else
			for (i = 0, j = 1; j <= n; j = j + 1, i = (i + 1) % tamanho)
				System.out.println(j + " " + vetor[i]);
	}
    
}