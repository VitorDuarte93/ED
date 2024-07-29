public class Main {

    public static void main(String[] args) {
        

        ListaOrdenadaGenerica<String> lista = new ListaOrdenadaGenerica<>();


        lista.insere("a");
        lista.insere("c");
        lista.insere("b");
        lista.insere("f");
        lista.insere("e");
        lista.insere("b");
        lista.imprime();
    }
    
}
