import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pilha pilha = new Pilha(20); // tamanho arbitrario

        int i = 0;
        String palavra;
        char letra;

        int chaves = 0, colchetes = 0, parenteseEsq = 0, parenteseDir = 0;
        boolean continua = true, chavesBalanceado = true, colchetesBalanceado = true, parenteseBalanceado = true;

        System.out.println("Entre com uma cadeia de caracteres: ");
        palavra = scanner.nextLine();

     
        do{ letra = palavra.charAt(i);
            pilha.push(letra);
           
            switch (letra) {
            case '{': if (chavesBalanceado == true && chaves == 0 && colchetesBalanceado == true && parenteseBalanceado == true) {
                chavesBalanceado = false;
                chaves++;          
            } else {
                continua = false;
            }
                break;

            case '}': if (chavesBalanceado == false && chaves == 1 && colchetesBalanceado == true && parenteseBalanceado == true) {
                chavesBalanceado = true;
                chaves--;                
            } else {
                continua = false;
            }
                break;  // controle das chaves { }

            case '[': if (colchetesBalanceado == true && colchetes == 0 && parenteseBalanceado == true) {
                colchetesBalanceado = false;
                colchetes++;                
            } else {
                continua = false;
            }
                break;

            case ']':  if (colchetesBalanceado == false && colchetes == 1 && parenteseBalanceado == true) {
                colchetesBalanceado = true;
                colchetes--;                
            } else {
                continua = false;
            }
                break;  // controle dos colchetes [ ]

            case '(': 
            parenteseEsq++;
            parenteseBalanceado = false;
            break;

            case ')': if (parenteseEsq > parenteseDir) {
                parenteseDir++;
            } else {
                continua = false;
            }

            if (parenteseEsq == parenteseDir){
                parenteseBalanceado = true;
            }
            break;  // controle dos parenteses

            default:                
            }

            i++;                 
        }while(i < palavra.length() && continua == true);

        if (continua == false) {
            System.out.println("Desbalanceado");            
        } else {
            System.out.println("Balanceado");
        }

        scanner.close();
    }
}
