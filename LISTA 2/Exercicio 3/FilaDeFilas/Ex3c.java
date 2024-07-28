package FIlaDePilhas;
import java.util.Scanner;

public class Ex3c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FilaGenerica<FilaGenerica>filaDeFilas;
        filaDeFilas = new FilaGenerica<>(3);


        FilaGenerica<Integer> fila = new FilaGenerica<>(2);
    
       int op;
       char c;

       do{
       System.out.println("Digite 1 para criar uma fila e insirir na fila ou 0 para sair");
       op = scanner.nextInt();

       if (op == 1) {
        while (!fila.cheia()) {
            fila.insere(2);
        }

        while (!filaDeFilas.cheia()) {
            filaDeFilas.insere(fila);
        }

        
       }
    } while(op != 0);

    while(!filaDeFilas.vazia()){
        FilaGenerica<FilaGenerica<Integer>> filaGAux = filaDeFilas.remove();
        while(!fila.vazia()){
            System.out.println(filaGAux.remove());
            System.out.println(" ");
        }
    }


    }
    
}
