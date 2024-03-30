
import java.util.Scanner;

public class TP02Ex05
{
    /*
     5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[3][2];

        for(int i = 0; i  < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("Digite o valor na posicao " + (i + 1) + ", " +(j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
            System.out.println("\n");
        }

        for(int i = 0; i  < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(array[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }
    }
}
