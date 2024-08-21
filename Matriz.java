import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        if (linhas <= 0 || colunas <= 0) {
            System.out.println("Erro: O número de linhas e colunas deve ser maior que zero.");
            return;
        }

        int[][] matriz = new int[linhas][colunas];


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz preenchida:");
        exibirMatriz(matriz, 0, 0);
    }

    public static void exibirMatriz(int[][] matriz, int linhaAtual, int colunaAtual) {

        if (linhaAtual >= matriz.length) {
            return;
        }


        System.out.print(matriz[linhaAtual][colunaAtual] + " ");

        if (colunaAtual == matriz[linhaAtual].length - 1) {
            System.out.println();
            exibirMatriz(matriz, linhaAtual + 1, 0);
        } else {
            exibirMatriz(matriz, linhaAtual, colunaAtual + 1);
        }
    }
}
