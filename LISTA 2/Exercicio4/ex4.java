import java.util.Scanner;

public class ex4 {        
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Fila fila = new Fila(5);

            int elemento;

            do{
                System.out.println("Insira um numero: ");
                elemento = scanner.nextInt();

                fila.insere(elemento);
            } while(!fila.cheia());
    
    
            FilaDupla filaDupla = FilaDupla.retornaFilaDupla(fila);
    
            filaDupla.imprime();
    
            
        }
    }