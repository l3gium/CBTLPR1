import java.util.Scanner;

public class TP02Ex11 
{
    /*
     Entrar com uma matriz de ordem MxM, onde a ordem tambem sera escolhida pelo usuario,
    sendo que no maximo sera de ordem 10 e quadratica. Apos a digitacao dos elementos,
    calcular e exibir determinante da matriz.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int ordem = scanner.nextInt();

        while (ordem < 1 || ordem > 10) 
        {
            System.out.println("A ordem da matriz deve ser entre 1 e 10.");
            ordem = scanner.nextInt();
        }

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) 
        {
            for (int j = 0; j < ordem; j++) 
            {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
            System.out.println("\n");
        }

        long determinante = calcularDeterminante(matriz);

        System.out.println("O determinante da matriz sera: " + determinante);

        scanner.close();
    }

    public static long calcularDeterminante(int[][] matriz) {
        int ordem = matriz.length;
        long determinante = 0;

        if (ordem == 1) 
        {
            determinante = matriz[0][0];
        } else if (ordem == 2) 
        {
            determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } 
        else 
        {
            for (int i = 0; i < ordem; i++) 
            {
                int[][] submatriz = new int[ordem - 1][ordem - 1];
                for (int j = 1; j < ordem; j++) 
                {
                    int k = 0;
                    for (int l = 0; l < ordem; l++) 
                    {
                        if (l != i) 
                        {
                            submatriz[j - 1][k] = matriz[j][l];
                            k++;
                        }
                    }
                }
                determinante += Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(submatriz);
            }
        }

        return determinante;
    }
}