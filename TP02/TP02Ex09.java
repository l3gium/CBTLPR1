import java.util.Scanner;

public class TP02Ex09
{
    /*
    9. Entrar com uma matriz de ordem MxN, onde a ordem tambem sera escolhida pelo usuario,
    sendo que no maximo 10x10. A matriz nao precisa ser quadratica. Apos a digitacao dos
    elementos, calcular e exibir a matriz transposta.
    */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = scan.nextInt();

        while(linhas <= 0 || linhas > 10)
        {
            System.out.println("Quantidade de linhas invalida! Digite novamente:");
            linhas = scan.nextInt();
        }

        System.out.println("Digite a quantidade de colunas: ");
        int colunas = scan.nextInt();

        while(colunas <= 0 || colunas > 10)
        {
            System.out.println("Quantidade de colunas invalida! Digite novamente:");
            colunas = scan.nextInt();
        }

        int[][] matriz1 = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++)
        {
            for(int j = 0; j < colunas; j++)
            {
                System.out.println("Digite o numero na posicao " + (i + 1) + ", " + (j + 1) + ": ");
                matriz1[i][j] = scan.nextInt();
            }
            System.out.println("\n");
        }

        System.out.println("Matriz original:\n");
        for(int i = 0; i  < linhas; i++)
        {
            for(int j = 0; j < colunas; j++)
            {
                System.out.print(matriz1[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }
        System.out.println("\n");
        
        System.out.println("Matriz transposta:\n");
        for(int i = 0; i  < colunas; i++)
        {
            for(int j = 0; j < linhas; j++)
            {
                System.out.print(matriz1[j][i]);
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }
    }
}