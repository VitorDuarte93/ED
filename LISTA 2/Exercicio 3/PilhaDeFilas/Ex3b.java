package PilhaDeFilas;

import java.util.Scanner;

public class Ex3b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica <Fila> pilhaDeFilas = new PilhaGenerica<>(3);

        Fila fila = new Fila(2);
    
       int op;
       

       do{
       System.out.println("Digite 1 para criar uma fila e insirir na pilha ou 0 para sair");
       op = scanner.nextInt();

       if (op == 1) {
            while (!fila.cheia()) {
            int i = 0;
            fila.insere(i);
            i++;
        }

        while (!pilhaDeFilas.cheia()) {
            pilhaDeFilas.push(fila);
            
        }
                
       }
    } while(op != 0);

    while(!pilhaDeFilas.vazia()){
        Fila filaAux = pilhaDeFilas.pop();
        while(!filaAux.vazia()){
            System.out.println(filaAux.remove());
            System.out.println(" ");
        }
    }



    }
 
}
