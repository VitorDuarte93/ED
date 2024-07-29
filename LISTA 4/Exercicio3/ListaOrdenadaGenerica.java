public class ListaOrdenadaGenerica<T extends Comparable<T>> extends ListaGenerica<T>
{
    /* Insere elemento na lista na posi��o adequada, mantendo-a ordenada. */
	public void insere(T novo)    //complexidade O(n) igual é na listaOrdenada comum
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (novo.compareTo(p.dado) > 0)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
	}

    /* Remove da lista o primeiro elemento com valor igual a �elem". Ret. true se removeu. */
	public boolean remove(T elem)    //complexidade O(n) igual é na listaOrdenada comum
	{
		Elo p;
		Elo ant = null; /* refer�ncia para anterior */
		
		for(p = prim; ((p != null) && (p.dado != elem)); p = p.prox)
			ant = p;

		/* Somente compara se p == null pois a outra compaação é feita antes*/
		if (p == null)
			return false;
		
		if (p == prim)
			prim = prim.prox; /* Remove elemento do in�cio. */
		else
			ant.prox = p.prox; /* Remove elemento do meio. */
	
        /* Remove a �ltima refer�ncia para o elo a ser removido. Dessa forma,
		 * o Garbage Collector ir� liberar essa mem�ria. */
		p = null;
		
		return true;
	}
}