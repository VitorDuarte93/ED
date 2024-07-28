import java.util.Scanner;

public class Exercicio4 {

    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);

        int n;
        Object c , t;
        int sair = 1, elemInseridos = 0;

        System.out.println("Insira o tamanho da pilha: ");
        n = scanner.nextInt();
        
        PilhaGenerica <Object> pilha = new PilhaGenerica<> (n);  
        PilhaGenerica <Object>pilhaAux = new PilhaGenerica<>(n);
        
        do{
            System.out.println("\nInsira o elemento: ");
            c = scanner.next();
            pilha.push(c);
            elemInseridos++;

            System.out.println("\nAinda restam " + (n - elemInseridos) + " espaços na pilha");

            if (!pilha.cheia()) {
                System.out.println("Caso deseje adicionar mais um elemento digite '1'");
                System.out.println("Caso não deseje adicionar mais elementos digite '2'");
                sair = scanner.nextInt();
            } else {
                System.out.println("Pilha cheia");
                sair = 2;
            }


        } while (!pilha.cheia() && sair == 1);

        System.out.println("\nInsira o elemento que deseja remover: ");
        t = scanner.next();

        while (!pilha.vazia()) {
            c = pilha.pop();
            pilhaAux.push(c);
            
            if(c.equals(t)){
                pilhaAux.pop();
            }                       
        }

        while (!pilhaAux.vazia()) {          //trocar elementos da pilha auxiliar para pilha principal
            c = pilhaAux.pop();
            pilha.push(c);
        }

        System.out.println("\nA pilha ficou:");
        while (!pilha.vazia()) {
            c = pilha.pop();
            System.out.println(c);            
        }

        scanner.close();
       
    }
}

