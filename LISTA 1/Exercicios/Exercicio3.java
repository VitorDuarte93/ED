import java.util.Scanner;

public class Exercicio3 {

    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);

        int n, opt, nPilha;
        char push, pop = '\0';

        System.out.println("Insira o tamanho do array: ");
        n = scanner.nextInt();
        char pilha[] = new char[n];
        int topoP1 = -1, topoP2 = n;
        boolean p1Vazia = true, p2Vazia = true;

        do {
            if (topoP1 > -1) {
                p1Vazia = false; // Verificar se a pilha está vazia para não causar erros
            } else {
                p1Vazia = true;
            }

            if (topoP2 < n) {
                p2Vazia = false;
            } else {
                p2Vazia = true;
            }

            System.out.println(
                    "Insira '1' para adicionar a uma pilha (PUSH), '2' para retirar de uma pilha (POP)\n '3' para imprimir o topo de uma das pilhas OU '4' para sair do programa");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Insira a letra que deseja adicionar: ");
                    push = scanner.next().charAt(0);
                    System.out.println("Digite '1' para adicionar a pilha 1 OU '2' para adicionar a pilha 2");
                    nPilha = scanner.nextInt();

                    if (nPilha == 1) {
                        topoP1++;
                        pilha[topoP1] = push;
                    } else if (nPilha == 2) {
                        topoP2--;
                        pilha[topoP2] = push;
                    } else {
                        System.out.println("Opção invalida");
                        break;
                    }
                    break;

                case 2:
                    System.out
                            .println("Digite '1' para remover o topo da pilha 1 OU '2' para remover o topo da pilha 2");
                    nPilha = scanner.nextInt();

                    if (nPilha == 1 && p1Vazia == true) {
                        System.out.println("Pilha 1 está vazia, impossivel utilizar POP\n");
                    } else if (nPilha == 2 && p2Vazia == true) {
                        System.out.println("Pilha 2 está vazia, impossivel utilizar POP\n");
                    } else {

                        if (nPilha == 1) {
                            pilha[topoP1] = pop;
                            topoP1--;
                        } else if (nPilha == 2) {
                            pilha[topoP2] = pop;
                            topoP2++;
                        } else {
                            System.out.println("Opção invalida\n");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite '1' para pilha 1 e '2' para pilha 2");
                    nPilha = scanner.nextInt();

                    if (nPilha == 1 && p1Vazia == true) {
                        System.out.println("Pilha 1 está vazia");
                    } else if (nPilha == 2 && p2Vazia == true) {
                        System.out.println("Pilha 2 está vazia");
                    } else {

                        if (nPilha == 1 || p1Vazia == false) {
                            System.out.println("TOPO PILHA 1: " + pilha[topoP1]);
                        } else if (nPilha == 2 || p2Vazia == false) {
                            System.out.println("TOPO PILHA 2: " + pilha[topoP2]);
                        }
                    }
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Opção invdalida");
                    break;
            }
        } while (opt != 4);

        scanner.close();

    }
}
