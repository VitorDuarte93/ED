import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ListaGenerica<Character> lista = new ListaGenerica<>();
        String frase;

        System.out.println("Insira a frase: ");
            frase = scanner.nextLine();
            
            for(int j = 0; j < frase.length(); j++){  //complexidade O(1) para inserir a frase como letra distinta
                lista.insere(frase.charAt(j));
            }

        lista.imprime();

    }
    
}
