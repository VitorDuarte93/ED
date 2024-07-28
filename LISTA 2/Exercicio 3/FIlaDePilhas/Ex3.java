package FIlaDePilhas;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FilaGenerica<Pilha>filaDePilhas;
        filaDePilhas = new FilaGenerica<>(3);


        Pilha pilha = new Pilha(2);
    
       int op;
       char c;

       do{
       System.out.println("Digite 1 para criar uma pilha e insirir na fila ou 0 para sair");
       op = scanner.nextInt();

       if (op == 1) {
        System.out.println("Digite um caractere");
        c = scanner.next().charAt(0);

        while (!pilha.cheia()) {
            pilha.push(c);
        }

        while (!filaDePilhas.cheia()) {
            filaDePilhas.insere(pilha);
        }

        
       }
    } while(op != 0);

    while(!filaDePilhas.vazia()){
        Pilha pilhaAux = filaDePilhas.remove();
        while(!pilhaAux.vazia()){
            System.out.println(pilhaAux.pop());
            System.out.println(" ");
        }
    }


    }
    
}
