import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ListaGenerica<String> lista = new ListaGenerica<>();
        String palavra;

        for (int i = 0; i < 3; i++){  //numero arbitrario de entradas;
            
            palavra = scanner.nextLine();
            lista.insereReverso(palavra);

        }

        lista.imprime();

    }
    
}
