import java.util.Scanner;

public class TP02Ex04
{
    /*
     4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[2][3];

        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Digite o valor na posicao " + (i + 1) + ", " +(j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
            System.out.println("\n");
        }

        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j] + "|");
            }
            System.out.print("\n");
            System.out.print("------");
            System.out.print("\n");
        }
    }
}
