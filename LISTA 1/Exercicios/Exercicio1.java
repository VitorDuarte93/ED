import java.util.Scanner;

public class Exercicio1 {

    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);

        Pilha pilha = new Pilha(10); // tamanho arbitrario
        String palavra;
        char letra;
        int i = 0, flag = 0; // flag para saber se o caractere 'C' foi encontrado
        boolean inverso = true;

        System.out.println("Entre com uma cadeia de caracteres: ");
        palavra = scanner.nextLine();

        while (i < palavra.length()) {
            letra = palavra.charAt(i);

            if (letra == 'C') {
                flag++;
                i++;
                letra = palavra.charAt(i); // pular caractere 'C'
            }

            if (flag == 0) {
                pilha.push(letra);
            } else {
                if (pilha.retornaTopo() == letra) {
                    pilha.pop();
                } else {
                    System.out.println("A CADEIA DE CARACTERES NÃO É INVERSA");
                    inverso = false;
                    break;
                }
            }
            i++;
        }

        if (inverso == true) {
            System.out.println("A CADEIA DE CARACTERES É INVERSA");
        }

        scanner.close();

    }
}
