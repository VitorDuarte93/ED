import java.util.Scanner;

public class Exercicio2 {

    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);

        Pilha pilha = new Pilha(50); // tamanho arbitrario
        String palavra;
        char letra;
        int i = 0, flagC = 0; // flag para saber se o caractere 'C' foi encontrado
        boolean inverso = true;

        System.out.println("Entre com uma cadeia de caracteres: ");
        palavra = scanner.nextLine();

        while (i < palavra.length()) {
            letra = palavra.charAt(i);

            if (letra == 'D') {
                flagC--;
                i++;
                letra = palavra.charAt(i); // pular caractere 'D'
            }

            if (letra == 'C') {
                flagC++;
                i++;
                letra = palavra.charAt(i); // pular caractere 'C'
            }

            if (flagC == 0) {
                pilha.push(letra);
            } else {
                if (pilha.retornaTopo() == letra) {
                    pilha.pop();
                } else {
                    System.out.println("AS CADEIAS DE CARACTERES NÃO SÃO INVERSAS");
                    inverso = false;

                    break;
                }
            }
            i++;
        }

        if (inverso == true) {
            System.out.println("AS CADEIAS DE CARACTERES SÃO INVERSAS");
        }

        scanner.close();

    }
}
