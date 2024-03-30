import java.util.Scanner;

public class TP02Ex10 
{
    /*10. Entrar com uma matriz de ordem MxM, onde a ordem tambem sera escolhida pelo usuario,
    sendo que no maximo sera de ordem 10 e quadratica. Apos a digitacao dos elementos,
    calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
    colunas). */

    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int ordem = scanner.nextInt();

        while (ordem <= 0 || ordem > 10) 
        {
            System.out.println("A ordem da matriz deve ser um número positivo menor ou igual a 10.");
            ordem = scanner.nextInt();
        }

        double[][] matriz = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) 
        {
            for (int j = 0; j < ordem; j++) 
            {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
            System.out.println("\n");
        }

        double[][] matrizInversa = calcularInversa(matriz);

        if (matrizInversa != null) 
        {
            System.out.println("\nMatriz Inversa:");
            exibirMatriz(matrizInversa);
        } else 
        {
            System.out.println("Não foi possível calcular a matriz inversa.");
        }
    }

    public static double[][] calcularInversa(double[][] matriz) 
    {
        int ordem = matriz.length;
        if (ordem != matriz[0].length) 
        {
            System.out.println("A matriz não é quadrada, portanto não possui inversa.");
            return null;
        }

        double[][] identidade = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) 
        {
            identidade[i][i] = 1.0;
        }

        for (int i = 0; i < ordem; i++) 
        {
            // Encontrando o pivô
            double pivot = matriz[i][i];
            if (pivot == 0) 
            {
                System.out.println("Não é possível calcular a inversa, pois a matriz é singular.");
                return null;
            }

            for (int j = 0; j < ordem; j++) 
            {
                matriz[i][j] /= pivot;
                identidade[i][j] /= pivot;
            }

            for (int k = 0; k < ordem; k++) 
            {
                if (k != i) 
                {
                    double factor = matriz[k][i];
                    for (int j = 0; j < ordem; j++) 
                    {
                        matriz[k][j] -= factor * matriz[i][j];
                        identidade[k][j] -= factor * identidade[i][j];
                    }
                }
            }
        }

        return identidade;
    }

    // Método para exibir a matriz
    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
