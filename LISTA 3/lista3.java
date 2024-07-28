/*
 
1) Diga a ordem de complexidade de cada um dos trechos de código a seguir: 

A: O (n)
B: O (n ^ 2)
c: O (n log n)

2) Assuma que cada uma das expressões abaixo represente o tempo de processamento T(n)
gasto por um algoritmo para resolver um problema cuja entrada possui tamanho n. Diga o 
termo dominante e a complexidade justa Big-Oh em cada expressão. 
      
A:      Termo Dominante - 0.001n^5           O (n^5)
B:      Termo Dominante - 50nlog n           O (n log n)
C:      Termo Dominante - 2.5 n^1.75         O (n^1.75)
D:      Termo Dominante - n^2 log2 n         O (n^2 log2 n)
E:      Termo Dominante - n log2 n           O (n log2 n)
F:      Termo Dominante - 3 log8 n           O (log8 n)
G:      Termo Dominante - 0.01n^2            O (0.01n^2)
H:      Termo Dominante - 100n^2             O (n^2)
I:      Termo Dominante - 0.5n^1.25          O (n^1.25)
J:      Termo Dominante - n(log2 n)^2        O (n(log2 n)^2)
K:      Termo Dominante - n^3                O (n^3)
L:      Termo Dominante - 0.003 log4 n       O (log4 n)


3) A seguir estão três implementações usando lógicas diferentes para realizar a tarefa de 
encontrar um elemento em um vetor ordenado. Diga qual a complexidade de cada método e 
explique como chegou a ela. 

I: Complexidade do while - O(n), pois ele repetirá n vezes, que é o tamanho do vetor.
Complexidade do if e return - O(1), ele somente faz 1 comparação e retorna 1 resultado
Complexidade do algoritmo - O(n), pois multiplicando as complexidades, O(n) * O(1) o resultado é O (n)

II: Complexidade do for - O(n), pois ele repetirá n vezes, que é o tamanho do vetor.
Complexidade do if e return - O(1), ele somente faz 1 comparação e retorna 1 resultado
Complexidade do algoritmo - O(n), pois multiplicando as complexidades, O(n) * O(1) o resultado é O (n)
Esse metodo é basicamente o mesmo do anterior

III: Complexidade do while - O (log n), pois esse é um algoritimo de busca binaria, logo ele vai percorrer n/2 no pior dos casos.
Complexidade do if e return - O(1), pois ele somente faz 1 comparação e retorna 1 resultado
Complexidade do algoritimo - O (log n), pois multiplicando as complexidades, O(log n) * O(1) o resultado é O (log n)


5) O método abaixo implementa em Java o algoritmo de ordenação Selection Sort. Mostre 
qual é a complexidade assintótica de tal método, exibindo também a conta que levou a tal 
complexidade. 

Complexidade do for - a complexidade de cada "for" é O (n), assim o segundo "for" tem complexidade O (n^2), pois ele repetria n vezes para cada vez que o primero "for" repetir 1 vez, assim sendo n * n = n^2
Complexidade dos if's e return's é O(1) pois ele somente faz 1 comparação e retorna 1 resultado
Multiplicando O(n^2) * O(1) = O(n^2)
Complexidade do algoritmo é O(n^2)  

 4 - Codigo a seguir
 
 */

import java.util.Scanner;

 public class lista3 {

    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);

        int num;
        int cont = 0;

        PilhaGenerica<Integer> pilha = new PilhaGenerica<>(10);

        while(!pilha.cheia()){
            System.out.println("Insira o numero desejado: ");
            num = scanner.nextInt();
            pilha.push(num);
            if (num % 2 == 0){
                cont ++;
            }
        }

        System.out.println("A quantidade de inteiros pares na pilha é de: " + cont);

        scanner.close();
       
    }
}