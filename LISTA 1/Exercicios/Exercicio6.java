import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
		Pilha pilha = new Pilha(50);
		String frase;
		char letra;
				
		System.out.println("Entre com uma frase: ");
		frase = scanner.nextLine();
		
		int i = 0;
		
		do{
			letra = frase.charAt(i);
			pilha.push(letra);
            i++;

			if (letra == ' ') {
                pilha.pop();  // para não imprimir o espaço no inicio da string
                while (!pilha.vazia()) {
                    letra = pilha.pop();
                    System.out.print(letra);
                }                
                System.out.print(" ");
            }

            if (i == frase.length()) {   // saber o final da frase
                while (!pilha.vazia()) {
                    letra = pilha.pop();
                    System.out.print(letra);
                }                
                System.out.print(" ");
            }
            
		} while ( i < frase.length() );      

        System.out.println("\n");

		scanner.close();
        
    }
    
}
