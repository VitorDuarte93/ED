import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        
        int n;

        System.out.println("Insira o N da sequencia: ");
        n = scanner.nextInt();
        int sequencia[] = new int[n];

        //preencher array com a sequencia
        for (int i = 1; i <= n; i++){
            sequencia[i - 1] = i;            
        }         

        System.out.println("\nSubsequencias");

        for (int i = 0; i < n; i++) {
            for (int o = i; o < n; o++) {
                for (int p = i; p <= o; p++) {
                    System.out.print(sequencia[p] + " ");
                }
                System.out.println();
            }
        }


        System.out.println("\nPares:");

        for (int i = 0; i <= n; i++){

            int a = i + 2;
            int b = i + 1;

            if (a != b && a > b && a <= n) {
                System.out.println("(" + a + "," + b + ")");
            }
                     
        } 

        scanner.close();   
        
    }
}
