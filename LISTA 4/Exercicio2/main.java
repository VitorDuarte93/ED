public class main {

    public static void main(String[] args) {

        
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();
        ListaOrdenada lista3 = new ListaOrdenada();

         for(int i = 0; i < 3; i++){   //preecnher lista 1, taanho arbitrario
             lista1.insere(i);
         };

         for(int i = 0; i < 5; i++){   //preecnher lista 2, taanho arbitrario
             lista2.insere(i);
         };
         
         lista1.imprime();
         lista2.imprime();

         lista3 = lista3.juntaLista(lista1, lista2);
         System.out.println("\nlista 3: ");
         lista3.imprime();


        
    }
    
}
