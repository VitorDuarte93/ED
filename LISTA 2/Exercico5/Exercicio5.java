import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, i = 1;
        int bin;

        System.out.print("Insira um numero N: ");
        numero = scanner.nextInt();

        Fila binarios = new Fila(numero);

        while (!binarios.cheia()) {
            bin = Binario.decimalParaBinario(i);
            binarios.insere(bin);
            i++;
        }

        while (!binarios.vazia()){
            System.out.print(binarios.remove());
            System.out.println("\n");
        }

        scanner.close();
    }

}